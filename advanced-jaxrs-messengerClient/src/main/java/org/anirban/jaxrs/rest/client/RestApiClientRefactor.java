package org.anirban.jaxrs.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Response;

import org.anirban.jaxrs.messenger.model.Message;

public class RestApiClientRefactor {

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
		
		Message message2 = singleMessageTarget
				.resolveTemplate("messageId", "2")
				.request()
				.get(Message.class);
				//.readEntity(Message.class);

		System.out.println(message2.getId()+"\n"+message2.getMessage()+"\n"+message2.getAuthor());

	}

}
