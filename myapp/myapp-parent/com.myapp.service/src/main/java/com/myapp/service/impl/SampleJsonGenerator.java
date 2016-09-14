package com.myapp.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.myapp.model.CreateAccount;

public class SampleJsonGenerator {

	public static void main(String[] args) throws Exception {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		CreateAccount accJson = new CreateAccount();

		accJson.setPhoneNumber("972");
		accJson.setEmailId("s@gmail.com");
		accJson.setPhoneOS("Apple");
		accJson.setActivated("N");
		accJson.setActivationType("Phone");
		accJson.setMemberType("Bussiness");
		accJson.setActivated("N");
		accJson.setActivatedDate(date);
		accJson.setRegistrationDate(date);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String json = mapper.writeValueAsString(accJson);
        System.out.println(json);

        
	}

}
