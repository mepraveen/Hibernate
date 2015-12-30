package com.praveen.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.praveen.domain.Student;

public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("starting");
		
		Student std = new Student();
		std.setName("praveen");
		std.setRoll(1);
		std.setDob(new Date());
		
		SessionFactory   sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		session.save(std);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
