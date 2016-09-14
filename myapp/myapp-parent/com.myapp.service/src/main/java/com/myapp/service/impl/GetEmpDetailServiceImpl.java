package com.myapp.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.myapp.impl.EmpDao;
import com.myapp.service.interfaces.GetEmpDetailService;

@Component("getEmp")
public class GetEmpDetailServiceImpl implements GetEmpDetailService {

	@Autowired
	private EmpDao empDao;
	
	public Response getEmpDetail(String employeeId) {

		if(StringUtils.isEmpty(employeeId)){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return  Response.ok(empDao.getEmp(employeeId)).build();
	}

}
