import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class EchoClient {
	
	public static void main(String [] args){
		// Recupero instance di Client
		Client client = ClientBuilder.newClient();
		
			// Get account balance
		//	String bal = client.target("http://.../atm/balance").
		//	    .pathParam("card", "111122223333")
		//	    .queryParam("pin", "9876") 
		//	    .request("text/plain").get(String.class);
			
		WebTarget target = client.target("http://localhost:8080/RESTfulService/echo");
		target=target.queryParam("echo_msg", "ciao");
		
		Response res = target.request("text/plain").get();
		
		System.out.println(res);
		System.out.println(res.readEntity(String.class));
	}
}
