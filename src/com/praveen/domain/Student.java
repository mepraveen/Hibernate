package com.praveen.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;






@Entity
@Table(name="student_info")
public class Student {
	
	
	@Id   @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	
	
	//create column with name whatever the value of name and
	//nullable false create the column with not null value
	
	
	//Transient is used to ignore the variable completely while creating Db table or
	//while create , update, insert delete operation
	@Transient
	@Column(name="name", nullable=false)
	private String name;
	
	
	
	//this temporal annotation make us choose what type you want to save timestamp, date
	@Temporal(TemporalType.DATE)
	private Date dob;
	

	
	public Student() {
		super();
	}



	public Student(Integer roll, String name, Date dob) {
		super();
		this.roll = roll;
		this.name = name;
		this.dob = dob;
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



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	
	

}
