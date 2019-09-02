package org.anirban.jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test/{date}")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(@PathParam("date") MyDate date){
		return "Hello REST Application!!!\nDate passed is: "+date.toString();
	}
}
