package com.venki.Firsthibernate1;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the name,Gender,salary");
    	Employee emp=new Employee(sc.next(),sc.next(),sc.nextInt());
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
        SessionFactory factory = con.buildSessionFactory();
        // Step 3: open one session
        Session session = factory.openSession();
        // Step 4: begin transaction
        Transaction transaction = session.beginTransaction();
        // Step 5
        session.persist(emp);
        transaction.commit();
        session.close();
        factory.close();

       
    }
}
