ExtendedDataTable.DataTable.header.prototype.OnSepMouseMove = function(event) {
	if (this.dragColumnInfo && this.dragColumnInfo.mouseDown) {
		if (!this.dragColumnInfo.dragStarted) {
			this.dragColumnInfo.dragStarted = true;
			this._showSplitter(this.dragColumnInfo.srcElement.columnIndex);
		}
		var delta = Event.pointerX(event) - this.dragColumnInfo.startX;
		if (delta < this.minDelta) {
			delta = this.minDelta;
		} /* if (delta > this.maxDelta) { delta = this.maxDelta; } */
		var x = this.dragColumnInfo.originalX + delta;
		var finalX = x - this.minColumnWidth - 6;// 6 stands for sep span
		// width;
		this.columnSplitter.moveToX(finalX);
		Event.stop(event);
	}
};

ExtendedDataTable.DataTable.header.prototype.OnSepMouseUp = function(event) {
	Event.stop(event);
	Event.stopObserving(document, 'mousemove', this.eventSepMouseMove);
	Event.stopObserving(document, 'mouseup', this.eventSepMouseUp);
	if (this.dragColumnInfo && this.dragColumnInfo.dragStarted) {
		this.dragColumnInfo.dragStarted = false;
		this.dragColumnInfo.mouseDown = false;
		var delta = Event.pointerX(event) - this.dragColumnInfo.startX;
		if (delta < this.minDelta) {
			delta = this.minDelta;
		}
		var columnIndex = this.dragColumnInfo.srcElement.columnIndex;
		var newWidth = this.getColumnWidth(columnIndex) + delta;
		this.extDt.setColumnWidth(columnIndex, newWidth);
		this.setColumnWidth(columnIndex, newWidth);
		this.extDt.updateLayout();
		if (this.extDt.onColumnResize) {
			this.extDt.columnWidths = "";
			for ( var i = 0; i < this.columnsNumber; i++) {
				this.extDt.columnWidths += "" + this.getColumnWidth(i) + ";";
			}
			this.extDt.onColumnResize(event, this.extDt.columnWidths);
		}
	}

	this._hideSplitter();
};

ExtendedDataTable.DataTable.prototype.calculateWidthsFromRatios = function() {
	LOG.debug('firing calculateWidthsFromRatios');
	var c = this.getColumns();
	var scrollbarWidth = this.getScrollbarWidth();
	this._scrollbarWidth = scrollbarWidth;
	LOG.debug('Scrollbar: ' + scrollbarWidth);
	var mainDivWidth = this.mainDiv.getWidth();
	LOG.debug('Main DIV: ' + mainDivWidth);
	var maxWidth = mainDivWidth - scrollbarWidth;
	LOG.debug('Width to spread: ' + maxWidth);
	var totalWidth = 0;
	for ( var i = 0; i < c.length - 1; i++) {
		LOG.debug('Column[' + i + '] ratio: ' + this.ratios[i]);
		var w = Math.round(this.ratios[i] * maxWidth);
		if (w < parseInt(this.minColumnWidth)) {
			w = parseInt(this.minColumnWidth);
		}
		LOG.debug('setting column ' + i + ' to width: ' + w);
		this.setColumnWidth(i, w);
		this.header.setColumnWidth(i, w);
		totalWidth += w;
	}
};
