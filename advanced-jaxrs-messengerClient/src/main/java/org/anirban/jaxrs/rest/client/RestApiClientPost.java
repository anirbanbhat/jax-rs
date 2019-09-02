package org.anirban.jaxrs.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.anirban.jaxrs.messenger.model.Message;

public class RestApiClientPost {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget=client.target("http://localhost:8080/advanced-jaxrs-messengerClient/webapi/");
		
		WebTarget messageTarget = baseTarget.path("messages");
		WebTarget singleMessageTarget = messageTarget.path("{messageId}");
		
		Message message1 = singleMessageTarget
				.resolveTemplate("messageId", "1")
				.request()
				.get(Message.class);
				//.readEntity);

		System.out.println(message1.getId()+"\n"+message1.getMessage()+"\n"+message1.getAuthor());
		
		Message newMessage = new Message(4, "Message created by client", "Client Author");
		Response postResponse=messageTarget
				.request()
				.post(Entity.json(newMessage));
		
		System.out.println(postResponse);
		
		Message createdMessage= postResponse.readEntity(Message.class);

		System.out.println(createdMessage.getId()+"\n"+createdMessage.getMessage()+"\n"+createdMessage.getAuthor());
	}

}
