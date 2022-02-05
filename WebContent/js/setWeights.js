$(document).on("change", ".wSelect", function(e) {
	e.preventDefault();
	
	let id = e.target.id;
	let val = e.target.value;
	
	$.ajax({
		url : "SetWeightsServlet",
	 	type : "GET",
	 	data : id +"="+ val,
	 	dataType : "text",
	 	complete : function(response, status) {
			console.log('OKAY SAVED', {response,status});
			$(e.target).addClass('alert-success');
			$(function () {
				$('[data-toggle="'+id+'"]').popover()
			});
	 	}
	});
});