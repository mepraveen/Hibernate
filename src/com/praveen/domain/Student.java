package com.praveen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name="student_info")
public class Student {
	
	
	@Id
	private Integer roll;
	
	@Column(name="name")
	private String name;

	
	public Student() {
		super();
	}

	public Student(Integer roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
