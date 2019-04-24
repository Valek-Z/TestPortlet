package exo.rest.service;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.exoplatform.services.rest.resource.ResourceContainer;

@Path("/demo")
@Produces("application/json")
public class RestService implements ResourceContainer {



	  
	  
	  @GET
	  @Path("/hello")
	  @RolesAllowed({"users"})
	  @Consumes(MediaType.APPLICATION_JSON)  
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response hello(@Context UriInfo uriInfo, @QueryParam("name") String name) {
		  
		
			if(name == null || "".equals(name)){
				name = "Guest";
			}
			  String greetings = "{ \"name\": \"Hello on portlet "   +name + "\" } " ;
		
	        return Response.created(uriInfo.getAbsolutePath())
					.entity(greetings)
					.type(MediaType.APPLICATION_JSON)
					.status(Response.Status.OK)
					.build();
	  }
	
	
}