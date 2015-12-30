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
@Table(name="student")
public class Student {
	
	
	
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	
	
	//create column with name whatever the value of name and
	//nullable false create the column with not null value
	
	
	//Transient is used to ignore the variable completely while creating Db table or
	//while create , update, insert delete operation
	@Transient
	@Column(name="nick_name", nullable=false)
	private String nick_name;
	
	private String studentName;
	
	
	
	//this temporal annotation make us choose what type you want to save timestamp, date
	@Temporal(TemporalType.DATE)
	private Date dob;
	

	
	public Student() {
		super();
	}



	public Student(Integer studentId, String nick_name, String studentName,
			Date dob) {
		super();
		this.studentId = studentId;
		this.nick_name = nick_name;
		this.studentName = studentName;
		this.dob = dob;
	}



	public Integer getStudentId() {
		return studentId;
	}



	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}



	public String getNick_name() {
		return nick_name;
	}



	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	

	
	
	

}
