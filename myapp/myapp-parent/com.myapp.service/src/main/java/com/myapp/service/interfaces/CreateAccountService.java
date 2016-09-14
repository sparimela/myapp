package com.myapp.service.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.util.JSONPObject;


@Path("/create")
public interface CreateAccountService {
	
	@POST
	@Consumes("text/plain")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/createaccount")
	public Response createAccount (String inputString);
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/getaccount")
	public Response getAccount (@QueryParam("phoneNumber") String phoneNumber);

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/getemp")
	public Response getEmpDetail(@QueryParam("employeeId") String employeeId);
		
}
