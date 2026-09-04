package com.venki.SecondHIbernate;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateBook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction= session.beginTransaction();
		System.out.println("Enter the book id to Update");
		int id=sc.nextInt();
		sc.nextLine();
		Book book=session.get(Book.class, id);
		if(book!=null) {
			System.out.println("Enter the New Name of the Book");
			book.setName(sc.next());
			System.out.println("Enter the price of the Book");
			book.setPrice(sc.nextInt());
			System.out.println("Enter the Name of the Author");
			book.setAuthor(sc.next());
			System.out.println("Enter the Name of the Publisher");
			book.setPublisher(sc.next());
			//no need to update session bcz hibernate will take of the update
		}else {
			System.out.println("Book not foung");
		}
		transaction.commit();
		session.close();
		factory.close();
		sc.close();
	}

}
