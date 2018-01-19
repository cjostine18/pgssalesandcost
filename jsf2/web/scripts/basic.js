function checkAllCheckboxesInTable(inputId, state, butId) {
	var commonIdPart = inputId.substr(0, inputId.lastIndexOf(':'));
	var tableElement = document.getElementById(commonIdPart);
	var inputs = tableElement.getElementsByTagName('input');
	for ( var i = 0; i < inputs.length; i++) {
		var input = inputs[i];
		if (state) {
			input.checked = true;
		} else {
			input.checked = false;
		}
	}
	// document.getElementById(butId).click();
}
function selectAll(inputId) {
	var commonIdPart = inputId.substr(0, inputId.lastIndexOf(':'));
	var tableElement = document.getElementById(commonIdPart);
	var inputs = tableElement.getElementsByTagName('input');
	var count = inputs.length;
	var selectCount = 0;
	var selAll = document.getElementById("filterDataForm:allBox");
	if(commonIdPart.indexOf('approveFilterForm') > -1){
		selAll = document.getElementById("approveFilterForm:allBox");
	}
	for ( var i = 0; i < count; i++) {
		if (inputs[i].checked == true) {
			selectCount++;
		}
	}
	if (count == selectCount) {
		selAll.checked = true;
	} else {
		selAll.checked = false;
	}
}
/** For action item. */
var checkboxId;
function closePanel() {
	if (checkboxId != null) {
		var item = document.getElementById(checkboxId);
		if (item != null) {
			item.checked = false;
		}
	}
}
/** Delete tranLnDtl */
function delTran(tranId) {
	if (confirm("Are you sure ?")) {
		var input = document.getElementById("pageForm:tranLnId");
		var tran = document.getElementById("pageForm:delTranLnDtl");
		if (tran != null && input != null) {
			input.value = tranId;
			tran.click();
		}
	}
}

function processObjects(suggestionBox) {
	var items = suggestionBox.getSelectedItems();
	var state = "";
	if (items.length > 0) {
		for ( var i = 0; i < items.length; i++) {
			state = items[i].prchsOrdrId;
		}
		var inputVal = state;
		// alert(document.getElementById("addTranFrom:prchordId").value);
		document.getElementById("addTranFrom:prchordId").value = inputVal;
		// alert(document.getElementById("addTranFrom:prchordId").value);
	}
}

function processObjEqu(suggestionBox) {

	var items = suggestionBox.getSelectedItems();
	var state = "";
	if (items.length > 0) {
		for ( var i = 0; i < items.length; i++) {
			state = items[i].equipmentId;
		}
		var inputVal = state;
		document.getElementById("addTranFrom:equmentId").value = inputVal;
		// alert(document.getElementById("addTranFrom:equmentId").value());
	}
}

function getFinanceComments(comId, rowInd) {
	var financeCommentsVal = document.getElementById(comId).value;
	var tempVal = rowInd + ":Fin-" + financeCommentsVal + ";";
	var inputHiddenVal = document.getElementById("tranIdVar").value;
	var projmsg = document.getElementById("pageForm:saveChanged1");
		if (inputHiddenVal != "") {
			inputHiddenVal = tempVal + inputHiddenVal;
		} else {
			inputHiddenVal = tempVal;
		}
		document.getElementById("tranIdVar").value = inputHiddenVal;
		projmsg.style.display = "block";
		document.getElementById("pageForm:saveChanged").style.display = "none";
	
	// alert(inputHiddenVal);
}

function getArInvoiceNum(comId, rowInd) {
	var arInvoiceNumVal = document.getElementById(comId).value;
	var tempVal = rowInd + ":Ari-" + arInvoiceNumVal + ";";
	var inputHiddenVal = document.getElementById("tranIdVar").value;
	var projmsg = document.getElementById("pageForm:saveChanged1");
		if (inputHiddenVal != "") {
			inputHiddenVal = tempVal + inputHiddenVal;
		} else {
			inputHiddenVal = tempVal;
		}
		document.getElementById("tranIdVar").value = inputHiddenVal;
		projmsg.style.display = "block";
		document.getElementById("pageForm:saveChanged").style.display = "none";
	

}

function getCustomerPoNumber(comId, rowInd) {
	var customerPoNumberVal = document.getElementById(comId).value;
	var tempVal = rowInd + ":Cus-" + customerPoNumberVal + ";";
	var inputHiddenVal = document.getElementById("tranIdVar").value;
	var projmsg = document.getElementById("pageForm:saveChanged1");

		if (inputHiddenVal != "") {
			inputHiddenVal = tempVal + inputHiddenVal;
		} else {
			inputHiddenVal = tempVal;
		}
		document.getElementById("tranIdVar").value = inputHiddenVal;
		projmsg.style.display = "block";
		document.getElementById("pageForm:saveChanged").style.display = "none";
	

}

function getCpmComments(comId, rowInd) {
	var financeCommentsVal = document.getElementById(comId).value;
	var tempVal = rowInd + ":Cpm-" + financeCommentsVal + ";";
	var inputHiddenVal = document.getElementById("tranIdVar").value;
	var projmsg = document.getElementById("pageForm:saveChanged1");
		if (inputHiddenVal != "") {
			inputHiddenVal = tempVal + inputHiddenVal;
		} else {
			inputHiddenVal = tempVal;
		}
		document.getElementById("tranIdVar").value = inputHiddenVal;
		projmsg.style.display = "block";
		document.getElementById("pageForm:saveChanged").style.display = "none";
}
function getRiskComments(comId, rowInd) {
	var riskCommentsVal = document.getElementById(comId).value;
	var tempVal = rowInd + ":Rsk-" + riskCommentsVal + ";";
	var inputHiddenVal = document.getElementById("tranIdVar").value;
	var projmsg = document.getElementById("pageForm:saveChanged1");
	if (inputHiddenVal != "") {
		inputHiddenVal = tempVal + inputHiddenVal;
	} else {
		inputHiddenVal = tempVal;
	}
	document.getElementById("tranIdVar").value = inputHiddenVal;
	projmsg.style.display = "block";
	document.getElementById("pageForm:saveChanged").style.display = "none";
}


function clearComments(flag) {
	if(flag==false){
		document.getElementById("tranIdVar").value = "";
	}
	
	// alert(document.getElementById("tranIdVar").value);
}

function cleanComments() {
	document.getElementById("tranIdVar").value = "";
	// alert(document.getElementById("tranIdVar").value);
}

function checkValition() {
	// alert('aaaaaaa');
	// var gaapSale =
	// document.getElementById("addTranFrom:addTrTbl").rows[4].cells[1].innerText;
	// var gaapCost =
	// document.getElementById("addTranFrom:addTrTbl").rows[4].cells[3].innerText;
	// var statSale =
	// document.getElementById("addTranFrom:addTrTbl").rows[5].cells[1].innerText;
	// var statCost =
	// document.getElementById("addTranFrom:addTrTbl").rows[5].cells[3].innerText;
	var isBilling = document.getElementById("addTranFrom:isBilling").value;
	var me = document.getElementById("addTranFrom:addTrTbl:meId").value;
	// alert(me);
	var itemDes = document.getElementById("addTranFrom:addTrTbl:itemDescVal").value;
	if (isBilling == "No") {
		// alert('aaaaaaa');
		var gaapSale = document
				.getElementById("addTranFrom:addTrTbl:gaapSales").value;
		// alert(gaapSale);
		var gaapCost = document.getElementById("addTranFrom:addTrTbl:gaapCost").value;
		// alert(gaapCost);
		var statSale = document
				.getElementById("addTranFrom:addTrTbl:statSales").value;
		// alert(statSale);
		var statCost = document.getElementById("addTranFrom:addTrTbl:statCost").value;
		// alert(statCost);
		// alert(111);

		if (itemDes == "" || me == "") {
			// alert(itemDes);
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied";
		}

		if (gaapSale == 0.00 && gaapCost == 0.00 && statSale == 0.00
				&& statCost == 0.00) {
			// document.getElementById("addTranFrom:valitionId").value = true;
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "At least one of the 4 field should be non zero";
		}

		if ((itemDes == "" || me == "") && gaapSale == 0.00 && gaapCost == 0.00
				&& statSale == 0.00 && statCost == 0.00) {
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied."
					+ "At least one of the 4 field should be non zero.";

		}
		// var valitionmsg = document.getElementById("addTranFrom:valmsg");
		var valitionmsg = document.getElementById("addTranFrom:addTrTbl").rows[6].cells[0];
		var valition = document.getElementById("addTranFrom:valitionId").value; 
		var projmsg = document.getElementById("addTranFrom:addTrTbl").rows[7].cells[0];
		var proj = document.getElementById("addTranFrom:existPro").value;
		// var errormsg =
		// document.getElementById("addTranFrom:showErrrorDetail").value;
			if (valition == "false") {
				Richfaces.showModalPanel('saveComplete');
				Richfaces.hideModalPanel('addTranLnDtl');
			} else {
				valitionmsg.style.display = "block";

			}
	}else {
		var billingAmtStr=document.getElementById("addTranFrom:addTrTbl:billAmtStr").value;
		if(itemDes == "" || me == ""){
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied";	
		}
		if(billingAmtStr==0.00){
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "billingAmtStr filed should be non zero";			
		}
		if ((itemDes == "" || me == "")&& billingAmtStr==0.00) {
			document.getElementById("addTranFrom:addTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied."
				+"billingAmtStr filed should be non zero";	
		}
		var valition = document.getElementById("addTranFrom:valitionId").value; 
		if (valition == "false") {
			Richfaces.showModalPanel('saveComplete');
			Richfaces.hideModalPanel('addTranLnDtl');
		} else {
			valitionmsg.style.display = "block";
		}
	}

	
	
}
function checkOpenItemID(billValue) {
	var flag=checkCommentNull();
	if(billValue == 'true'){
		if(flag==true){
			Richfaces.hideModalPanel('backlogPanel');
			Richfaces.showModalPanel('showOpenItemId');
		}else{
			Richfaces.showModalPanel('backlogPanel');	
		}	
	}else{
		var gaapCm=checkGaapCurrentCm();
		var statCm=checkStatCurrentCm();
	    var checkME=checkTranferME();
		if(flag==true&&gaapCm==true&&statCm==true&&checkME==true){
			Richfaces.hideModalPanel('backlogPanel');
			Richfaces.showModalPanel('showOpenItemId');
		}else{
			Richfaces.showModalPanel('backlogPanel');	
		}
	}
}
function checkOpenItemBy() {
	var flag=checkCommentsNull();
	// var valition =
	// document.getElementById("OpenItemtable3:backlogPanelTable2:openCommentFalgs").value;
	// if(flag==true&&valition=="true"){
	if(flag==true){
		Richfaces.hideModalPanel('backlogPanel');
		Richfaces.showModalPanel('showOpenItemId');
	}else{
		Richfaces.showModalPanel('backlogPanel');
	}
}
function checkActionItemID() { 
	var flag=checkActionComments();
	// var valition =
	// document.getElementById("ActionItemtable3:actionTable:actionComment").value;
// if(flag==true&&valition=="true"){
	if(flag==true){
		Richfaces.hideModalPanel('ActionPanel');
		Richfaces.showModalPanel('showActionItemId');
	 }else{
	 Richfaces.showModalPanel('ActionPanel');
	 }
}
function showImportMessage() {
	Richfaces.showModalPanel('showMessgae');
}
function closeImproPanel() {
	Richfaces.hideModalPanel('showMessgae');
}

function checkCommentNull() {
	var openComment = document.getElementById("OpenItemtable3:backlogPanelTable:openComment").value;
	if (openComment.length==0) {
		document.getElementById("OpenItemtable3:backlogPanelTable:showErrrorDetail").innerText = "the mandatory field is not supplied";
		return false;
	}else {
		document.getElementById("OpenItemtable3:backlogPanelTable:showErrrorDetail").innerText = "";
		return true;
	}
}
function checkGaapCurrentCm(){
	var gaapcmValue=document.getElementById("OpenItemtable3:backlogPanelTable:gaapcmValue").value;
	if(gaapcmValue>100||gaapcmValue<-100){
		document.getElementById("OpenItemtable3:backlogPanelTable:showGAAPErrorMsg").innerText = "GAAP CM% field should between -100 and 100";
		return false;
	}else{
		document.getElementById("OpenItemtable3:backlogPanelTable:showGAAPErrorMsg").innerText = "";
		return true;
	}
}

function checkTranferME(){
	var meNotFound=document.getElementById("OpenItemtable3:backlogPanelTable:meNotFound").value;
	if(meNotFound=="false"){
		document.getElementById("OpenItemtable3:backlogPanelTable:showMErrorMsg").innerText = "";
		return true;
	}else{
		document.getElementById("OpenItemtable3:backlogPanelTable:showMErrorMsg").innerText = "this ME is incorrect";
		return false;
	}
	
}
function checkStatCurrentCm(){
	var statcmValue=document.getElementById("OpenItemtable3:backlogPanelTable:statcmValue").value;
	if(statcmValue>100||statcmValue<-100){
		document.getElementById("OpenItemtable3:backlogPanelTable:showSTATErrorMsg").innerText = "STAT CM% field should between -100 and 100";
		return false;
	}else{
		document.getElementById("OpenItemtable3:backlogPanelTable:showSTATErrorMsg").innerText = "";
		return true;
	}
}

function checkCommentsNull() {
	var openComment = document.getElementById("OpenItemtable3:backlogPanelTable2:openComments").value;
	if (openComment.length==0) {
		document.getElementById("OpenItemtable3:backlogPanelTable2:showErrrorDetails").innerText = "the mandatory field is not supplied";
	return false;
	} else {
		document.getElementById("OpenItemtable3:backlogPanelTable2:showErrrorDetails").innerText = "";
	return true;	
	}

}
function checkActionComments() {
	var actionComment = document.getElementById("ActionItemtable3:actionTable:opening").value;
	if (actionComment.length==0) {
		document.getElementById("ActionItemtable3:actionTable:showActionDetails").innerText = "the mandatory field is not supplied";
	    return false;
	} else {
		document.getElementById("ActionItemtable3:actionTable:showActionDetails").innerText = "";
	    return true	;
	}
}

function checkEditValition() {
	var isBilling = document.getElementById("editTranFrom:isBilling").value;
	var me = document.getElementById("editTranFrom:editTrTbl:meId").value;
	// var valitionmsg = document.getElementById("addTranFrom:valmsg");
	var valitionmsg = document.getElementById("editTranFrom:editTrTbl").rows[6].cells[0];
	var valition = document.getElementById("editTranFrom:valitionId").value; 
//	var projmsg = document.getElementById("editTranFrom:editTrTbl").rows[7].cells[0];
//	var proj = document.getElementById("editTranFrom:existPro").value;
	 //alert(me);
	var itemDes = document.getElementById("editTranFrom:editTrTbl:itemDescVal").value;
	
	if (isBilling == "No") {
		var gaapSale = document
				.getElementById("editTranFrom:editTrTbl:gaapSales").value;
		// alert(gaapSale);
		var gaapCost = document.getElementById("editTranFrom:editTrTbl:gaapCost").value;
		// alert(gaapCost);
		var statSale = document
				.getElementById("editTranFrom:editTrTbl:statSales").value;
		// alert(statSale);
		var statCost = document.getElementById("editTranFrom:editTrTbl:statCost").value;
		// alert(statCost);
		// alert(111);

		if (itemDes == "" || me == "") {
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied";
		}
		
		if (gaapSale == 0.00 && gaapCost == 0.00 && statSale == 0.00
				&& statCost == 0.00) {
			// document.getElementById("addTranFrom:valitionId").value = true;
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "At least one of the 4 field should be non zero";
		}

		if ((itemDes == "" || me == "") && gaapSale == 0.00 && gaapCost == 0.00
				&& statSale == 0.00 && statCost == 0.00) {
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied."
					+ "At least one of the 4 field should be non zero.";

		}
		// var errormsg =
		// document.getElementById("addTranFrom:showErrrorDetail").value;
			if (valition == "false") {
				Richfaces.showModalPanel('saveComplete');
				Richfaces.hideModalPanel('editTranLnDtl');
			} else {
				valitionmsg.style.display = "block";

			}
	}else {
		var billingAmtStr=document.getElementById("editTranFrom:editTrTbl:billAmtStr").value;
		if(itemDes == "" || me == ""){
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied";	
		}
		if(billingAmtStr==0.00){
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "billingAmtStr filed should be non zero";			
		}
		if ((itemDes == "" || me == "")&& billingAmtStr==0.00) {
			document.getElementById("editTranFrom:editTrTbl:showErrrorDetail").innerText = "One of the mandatory field is not supplied."
				+"billingAmtStr filed should be non zero";	
		}
		var valition = document.getElementById("editTranFrom:valitionId").value; 
		if (valition == "false") {
			Richfaces.showModalPanel('saveComplete');
			Richfaces.hideModalPanel('editTranLnDtl');
		} else {
			valitionmsg.style.display = "block";
		}
	}
//	var valitionmsg = document.getElementById("editTranFrom:editTrTbl").rows[6].cells[0];
//	var valition = document.getElementById("editTranFrom:valitionId").value;
//	var projmsg = document.getElementById("editTranFrom:editTrTbl").rows[7].cells[0];
//	var proj = document.getElementById("editTranFrom:existPro").value;
//	
//	if (valition == "false") {
//		Richfaces.showModalPanel('saveComplete');
//		Richfaces.hideModalPanel('editTranLnDtl');
//	} else {
//		valitionmsg.style.display = "block";
//
//	}
	
// if (valition == "false") {
// Richfaces.showModalPanel('saveComplete');
// Richfaces.hideModalPanel('addTranLnDtl');
// } else {
// valitionmsg.style.display = "block";
//
// }
//	
}

function checkSaved(datas) {
	var commentVar = document.getElementById("tranIdVar");
	var message = "You are navigating away from the page, without saving. Your changes would be lost.";
	if(commentVar != null ){
		if((commentVar.value != null && commentVar.value != '')){
			if (confirm(message)) {
				return true;
			} else {
				return false;
			}
		}
	}
	if (datas > 0) {
		if (confirm(message)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	return true;
}

function getIndex(index, tranNum) {
	var tranNumTemp = tranNum.substring(0, 4);
	if (tranNumTemp == "CNFM" || tranNumTemp == "cnfm") {
		document.getElementById("pageForm:rowIndex").value = index;
		document.getElementById("pageForm:editTrans").click();
	}
}
function checkApprove(){
	var outMsg = document.getElementById('approveMsgForm:showApprove');
	if(outMsg.value == 'true'){
		Richfaces.showModalPanel('approvePanel');
	}else{
		Richfaces.showModalPanel('approveMsg');
	}
}
function checkApproveEmpty(approves){
	var outMsg = document.getElementById('approveMsgForm:showApprove');
	if(outMsg.value == 'false'){
		Richfaces.hideModalPanel('approvePanel');
		Richfaces.showModalPanel('approveMsg');
	}else{
		if(approves == null || approves == 0){
			Richfaces.hideModalPanel('approvePanel');
		}else{
			Richfaces.showModalPanel('saveComplete');
		}
	}
}
