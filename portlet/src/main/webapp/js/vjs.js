(function( $){
    $(document).ready(function(){
    	
    	$("#send").on("click",function (){
    		alert("Click send" );
    		$.ajax({
    			type : 'POST',
        		url: '/portal/rest/demo/hello',
        		
        		 contentType: 'application / x-www-form-urlencoded',
    			
    			data : {
    				userName : $('#userName').val()
    			}
    		})
    			.done(function(response) {
    				var hellofromserver = response.parseJSON( response  );
    				$('#ajaxPOSTUserServletResponse').text(hellofromserver);
    			   
    			})
    			.fail(function(jqXHR, textStatus, errorThrown) {
    				console.log(textStatus );    			
    			});    	
    	});
    });	
    
    
    	  $(document).ready(function(){
	$("#sendGET").on("click",function (){
    		
    		$.ajax({
    			type : 'GET',
        		url: '/portal/rest/demo/hello',
        		 dataType : 'json',
        		 contentType: 'application/JSON; charset=utf-8',
    			
    			data : {
    				name : $('#name').val()
    			},
    			
    		})
    			.done(function(response) {
    				var hellofromserver = response.parseJSON( response  );
    				$('#ajaxGetUserPortletResponse').text(hellofromserver);
    			   
    			})
    			.fail(function(jqXHR, textStatus, errorThrown) {
    				
    			
    				console.log("fail " +jqXHR+ " text " +textStatus + " error " +errorThrown  );    			
    			});    	
    	});
    });	
    	  
    	  $(document).ready(function(){
    			$("#sendf").on("click",function (){
    		    		
    		    		$.ajax({
    		    			type : 'GET',
    		        		url: '/portal/rest/demo/hell',
    		        		dataType: "text/xml",    		        	
    		        		 contentType: 'application/xml',
    		    			
    		    			data : {
    		    				name : $('#nameV').val()
    		    			},
    		    		
    		    		})
    		    			.done(function(data) {
    		    				var hellofromserver = response.parseJSON( data  );
    		    				$('#ajaxSendUserPortletResponse').text(hellofromserver);
    		    			   
    		    			})
    		    			.fail(function(jqXHR, textStatus, errorThrown) {
    		    			
    		    				
    		    				console.log("fail " +jqXHR+ " text " +textStatus + " error " +errorThrown  );    			
    		    			});    	
    		    	});
    		    });	 	  

   
})( jq);