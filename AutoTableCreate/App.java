package com.venki.AutoTableCreation;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name,age, and address");
        Student std=new Student(sc.next(),sc.nextInt(),sc.next());
        Configuration con=new Configuration();
        con.configure("hibernate.cfg.xml");
        
       

        SessionFactory factory = con.buildSessionFactory(); 
        Session session = factory.openSession();
       
        Transaction transaction = session.beginTransaction();
        session.persist(std);
        transaction.commit();
        
        session.close();
        factory.close();
        
    }
}
