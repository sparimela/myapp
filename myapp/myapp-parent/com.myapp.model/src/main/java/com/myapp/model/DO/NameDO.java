package com.myapp.model.DO;

import info.archinnov.achilles.annotations.Column;
import info.archinnov.achilles.annotations.Entity;
import info.archinnov.achilles.annotations.Id;

@Entity(table = "name")
public class NameDO {
	
	@Id(name = "last")
	private String last;

	@Column(name = "first")
	private String first;

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
	
	

}
