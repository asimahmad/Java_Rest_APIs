package Test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@Path("/Hello")
public class Hello {
	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayHello()
//	{
//		String resource = "<? xml version= '1.0' ?>" +
//				"<hello> Hi Asim, This is hello from XML.</hello>";
//		return resource;
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String sayHelloJSON()
//	{
//		String resource = null;
//		return resource;
//	}
//	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("Card_no") String Card_no, @QueryParam("amount") int amount)
	{
		System.out.println("Name is "+ name);
		System.out.println("Amount "+ amount);
		String response;
		if(amount > 100000)
		{
			System.out.println("Amount is greater than 1 lakh");
			response = "Credit card is not approved.";
		}
		else
		{
			System.out.println("Amount is lesser than 1 lakh");
			response = "Credit card is not approved.";
		}
		return "<html>" + "<title>" + "Credit card authorization " + name + "</title>"
				+ "<body><h1>" + response + "</h1></body>" + "</html>";
	}

}
