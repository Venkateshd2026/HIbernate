package com.venki.SecondHIbernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans=session.beginTransaction();
		
		System.out.println("Enter the id to delete the book");
		int id=sc.nextInt();
		Book ref=session.get(Book.class, id);
		if(ref!=null) {
			session.remove(ref);
			System.out.println("Book Deleted Successfullly");
			
		}else {
			System.out.println("Book not found");
			
		}
		trans.commit();
		session.close();
		factory.close();
		sc.close();
	}

}
