package org.anirban.jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class MyResource {

	@PathParam("pathParam") private String pathParam;
	@QueryParam("queryParam") private String queryParam;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "Hello REST Application!!!\nProvided pathParam is: "+pathParam+"\nProvided queryParam is: "+queryParam;
	}
}
