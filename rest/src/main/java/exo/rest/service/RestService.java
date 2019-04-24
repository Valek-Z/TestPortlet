package exo.rest.service;



import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;



import org.exoplatform.services.rest.resource.ResourceContainer;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/demo")
@Produces("application/json")
public class RestService implements ResourceContainer {





	@POST
	@Path("/hello")
	@RolesAllowed("users")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
	 @Produces(MediaType.APPLICATION_JSON)
	public Response sayhello (@Context UriInfo uriInfo, @QueryParam("userName") String userName  ) throws Exception {
		

	
		if(userName == null || "".equals(userName)){
			userName = "Guest";
		}
		  String greetings = "{ \"userName\": {\"Hello "   +userName + "\"} }" ;

		//String greetings = "Hello " + userName;

		return Response.created(uriInfo.getAbsolutePath())
				.entity(greetings)
				.type(MediaType.APPLICATION_JSON)
				.status(Response.Status.OK)
				.build();
	}

	  @GET
	  @Path("/hell")
	  @RolesAllowed({"users"})
	  @Consumes(MediaType.APPLICATION_XML)  
	  @Produces(MediaType.APPLICATION_XML)
	    
	  public Response helloform (@Context UriInfo uriInfo, @QueryParam("nameV") String name) {
		  name = "nameform  " + name;
		  
	        return Response.created(uriInfo.getAbsolutePath())
					.entity(name)
					.type(MediaType.APPLICATION_XML)
					.status(Response.Status.OK)
					.build();
	  }
	
	  
	  
	  @GET
	  @Path("/hello")
	  @RolesAllowed({"users"})
	  @Consumes(MediaType.APPLICATION_JSON)  
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response hello(@Context UriInfo uriInfo, @QueryParam("name") String name) {
		  
		
		
		  String greetings = "{ \"name\": {\"Hello "   +name + "\"} }" ;
		
	        return Response.created(uriInfo.getAbsolutePath())
					.entity(greetings)
					.type(MediaType.APPLICATION_JSON)
					.status(Response.Status.OK)
					.build();
	  }
	
	
}