package org.anirban.jaxrs.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Date testMethod(){
		return new Date();
	}
}
