(function( $){  
	$(document).ready(function(){
		$("#sendGET").on("click",function (){	
			$.ajax({
				type : 'GET',
				url: '/portal/rest/demo/hello',
				dataType : 'json',
				contentType: 'application/JSON; charset=utf-8',
				data : {
					name : $('#name').val() }, 	
					})   		
					.done(function(json) {  	
						$('#ajaxGetUserPortletResponse').text(JSON.stringify(json.name) );  	
						})   			
						.fail(function(jqXHR, textStatus, errorThrown) { 		
							console.log("fail " +jqXHR+ " text " +textStatus + " error " +errorThrown  );      			
							}); 
			});
		});	
	})( jq);