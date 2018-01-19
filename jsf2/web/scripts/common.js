// JavaScript Document

// JQUERY FUNCTIONS
$(document).ready(function(){
						   
	// USER TOOLS JQUERY FUNCTIONS 
	$(".user-tools a").hover(function(){
		$(".user-tools h2.user-tool-name").show();
		$(".user-tools").css("background","#948a7c");
	});
	$(".tools-print a").hover(function(){
		$(".user-tools h2.user-tool-name").html("Print");
		$(".tools-print a").css("background-position","-33px -60px");
		$(".tools-bookmark a").css("background-position","-132px -30px");
	});
	$(".tools-bookmark a").hover(function(){
		$(".user-tools h2.user-tool-name").html("Book Mark");
		$(".tools-bookmark a").css("background-position","-132px -60px");
		$(".tools-print a").css("background-position","-33px -30px");
	});
	$(".user-tools a").mouseout(function(){
		$(".user-tools h2.user-tool-name").hide();
		$(".user-tools").css("background","none");
		$(".tools-bookmark a").css("background-position","-132px 0px");
		$(".tools-print a").css("background-position","-33px 0px");
	});
	
	// ONFOCUS AND ONBLUR FOR TEXT BOX AND TEXTAREA
	
	$('.placeholder').each(function(){	
		var $input = $(this);
		var $input_val = $input.val();
		$input
		.focus(function() {
			if ($input.val() === $input_val) {
				$input.val('');
			}
		})
		.blur(function() {
			if ($input.val() === '') {
				$input.val($input_val)
			}
		})
	});

	// FUNCTIONS FOR EXPAND COLLAPSE
	
	var nav = $(".cm-details");
	nav.find("li").each(function() {
		if ($(this).find("ul").length > 0) {
			$(this).click(function() {
				$(this).find("ul").slideToggle(500);
				$(this).find("a").toggleClass("collapse")
			});
		}
	});

	// FUNCTIONS FOR OPTIONS
	
	$('#model_ck').click(function(){
		$('#me').hide();
		$('#model').show();
	});
	$('#me_ck').click(function(){
		$('#model').hide();
		$('#me').show();
	});
	
	// FUNCTIONS FOR HEADER COLUMN HOVER
	$('#model th,#me th').mouseover(function(){
		$(this).find('.rt-arrow').show();
	});
	 $('#model th,#me th').mouseout(function(){
		$(this).find('.rt-arrow').hide();
	});
	 
	 //PRIMARY NAV DROPDOWN
	$('.nav li').hover(function(){
		$(this).find('.nav-drop').show();
	});
	$('.nav li').mouseleave(function(){
		$(this).find('.nav-drop').hide();
	});
	
	// SELECT MES DROPDOWNS
	$('#SME1').hover(function(){
		$(this).find('#SME-DD1').show();
	});
	$('#SME1').mouseleave(function(){
		$(this).find('#SME-DD1').hide();
	});
	$('#SME2').hover(function(){
		$(this).find('#SME-DD2').show();
	});
	$('#SME2').mouseleave(function(){
		$(this).find('#SME-DD2').hide();
	});
	
	// SORTING DROPDOWNS
	$('span.rt-arrow').hover(function(){
		$(this).find('a').addClass('active');
		$(this).find('.sorting-dd').show();
	});
	$('span.rt-arrow').mouseleave(function(){
		$(this).find('a').removeClass('active');
		$(this).find('.sorting-dd').hide();
	});
	
	$('.sorting-dd .parent').hover(function(){
		$(this).addClass('active');
		$(this).find('.sorting-dd-child').show();
	});
	$('.sorting-dd .parent').mouseleave(function(){
		$(this).removeClass('active');
		$(this).find('.sorting-dd-child').hide();
	});
	
});