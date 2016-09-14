package com.myapp.service.impl;

import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.google.gson.Gson;
import com.myapp.impl.EmpDao;
import com.myapp.model.CreateAccount;
import com.myapp.service.interfaces.CreateAccountService;

@Component("createAccountService")
public class CreateAccountServiceImpl implements CreateAccountService{

	@Autowired
	private EmpDao empDao;
	
	@Override
	public Response createAccount(String inputString) {
		
		Gson gson = new Gson();
		//String input = inputJson.toString();

		CreateAccount accOject = gson.fromJson(inputString, CreateAccount.class);
		
		return Response.status(Status.OK).entity(accOject).build();
	}

	@Override
	public Response getAccount(String phoneNumber) {
		
		CreateAccount accJson = new CreateAccount();
		Date date = new Date();

		
		accJson.setPhoneNumber("9729005816");
		accJson.setEmailId("sparimela@yahoo.com");
		accJson.setPhoneOS("Apple");
		accJson.setActivated("N");
		accJson.setActivationType("Phone");
		accJson.setMemberType("Bussiness");
		accJson.setActivated("N");
		accJson.setActivatedDate(date);
		accJson.setRegistrationDate(date);
	
		
		return Response.status(Status.OK).entity(accJson).build();

	}

	@Override
	public Response getEmpDetail(String employeeId) {

		if(StringUtils.isEmpty(employeeId)){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return  Response.ok(empDao.getEmp(employeeId)).build();
	}
	


}
