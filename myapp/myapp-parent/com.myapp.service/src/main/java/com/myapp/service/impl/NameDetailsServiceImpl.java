package com.myapp.service.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.myapp.model.Name;
import com.myapp.model.DO.NameDO;
import com.myapp.repository.NameRepository;
import com.myapp.service.interfaces.NameDetailsService;

public class NameDetailsServiceImpl implements NameDetailsService{
	
	@Autowired
	private NameRepository nameRepository;
	
	@Override
	public Response updateName(String inputString) {
		Gson gson = new Gson();
		Name name = gson.fromJson(inputString, Name.class);
		NameDO nameDO = new NameDO();
		
		nameDO.setFirst(name.getFirst());
		nameDO.setLast(name.getLast());
		
		nameRepository.update(nameDO);
		
		return Response.status(Status.OK).entity(name).build();
	}

}
