package org.anirban.jaxrs.rest.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.client.Invocation.Builder;

public class RestApiClient {

	public static void main(String[] args){
		Client client = ClientBuilder.newClient();
		//WebTarget webTarget=client.target("http://localhost:8080/advanced-jaxrs-messengerClient/webapi/messages/1");
		WebTarget webTarget=client.target("http://ms-test13-edge-vip:8082/api/entitlements/cn/8074820595/ea");
		//WebTarget webTarget=client.target("http://ms-test13-edge-vip:8082/api/entitlements/cn/8074820595/ea/112148812");
		com.sun.jersey.api.client.Client client2 = com.sun.jersey.api.client.Client.create();
		WebResource webResource=client2.resource("http://ms-test13-edge-vip:8082/api/entitlements/cn/8074820595/ea");
		Builder requestBuilder=webTarget.request(MediaType.APPLICATION_JSON);
		Response response = requestBuilder.get();
		int responseStatus = response.getStatus();
		//System.out.println(response);
		//Message message = response.readEntity(Message.class);
		/*if(responseStatus == 200){
			EntitlementAccountVO entitlementAccountVO = requestBuilder.get(EntitlementAccountVO.class);
			System.out.println("Response Status: " + responseStatus + "\nEntitlement AccountVO: " + entitlementAccountVO.toString());
		} else {
			ResponseError error = response.readEntity(ResponseError.class);
			System.out.println("Error Status: " + responseStatus + "\nError: " + error.toString());
		}*/
		
		/*ClientResponse response2 = webResource.type(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
		
		 JSONObject jsonOutput = (JSONObject) JSONSerializer.toJSON( response2.getEntity(String.class) );
		System.out.println("jsonOutput : " + jsonOutput);*/
		List<String> eaNameList = new ArrayList<>();
		JsonParser parser = new JsonParser();
		JsonArray objArray = (JsonArray) parser.parse(requestBuilder.get(String.class));
		System.out.println(objArray);
		if (objArray.size() > 0) {
			for (int i = 0;i < objArray.size();i++) {
				JsonElement q = objArray.get(i);
				System.out.println(q);
				if (q.isJsonObject()) {		
					JsonObject o = q.getAsJsonObject();
					String eaid = o.get("eaName") != null ? o.get("eaName").getAsString():"";
					System.out.println(eaid);
					eaNameList.add(eaid);
				}
					
			}
		}	
		if(!eaNameList.isEmpty() && eaNameList.contains("Qatest08071")){
			System.out.println(true);
		}
	}
}
