package org.anirban.jaxrs.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Singleton
public class MyResource {

	private int count=0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		count++;
		return "Hello REST Application!!!\nApplication is called "+count+" times...";
	}
}
