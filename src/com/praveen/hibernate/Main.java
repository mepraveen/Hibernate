package com.praveen.hibernate;

import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.praveen.domain.Student;
import com.praveen.domain.StudentInfo;


public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("starting");
		
		Student std = new Student();
		std.setDob(new Date());
		std.setNick_name("dev");
		std.setStudentName("praveen");
		
		
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setStudentMobile(9999999);
		studentInfo.setStudent(std);
	
		SessionFactory   sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
				
		session.save(studentInfo);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
