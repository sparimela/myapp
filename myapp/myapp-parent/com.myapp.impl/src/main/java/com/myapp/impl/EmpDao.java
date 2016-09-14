package com.myapp.impl;

import org.springframework.stereotype.Repository;

import com.myapp.model.Emp;


@Repository
public class EmpDao {
	
	public Emp getEmp(String empId){
		
		Emp emp = new Emp();
		emp.setEmployeeId("4");
		emp.setFirstName("Sri");
		emp.setLastName("Parimela");
		return emp;
		
	}

}
