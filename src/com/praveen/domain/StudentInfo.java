package com.praveen.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="student_info")
public class StudentInfo {
	
	
	@Id  @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name="newGenerator" , strategy="foreign", parameters={@Parameter(value="student", name="property")})
	private Integer studentId;
	
	@Column(name="mobile")
	private Integer studentMobile;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="studentId")
	private Student student;
	
	





	public Integer getStudentId() {
		return studentId;
	}



	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}






	public Integer getStudentMobile() {
		return studentMobile;
	}



	public void setStudentMobile(Integer studentMobile) {
		this.studentMobile = studentMobile;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}


	
	
	
	

}
