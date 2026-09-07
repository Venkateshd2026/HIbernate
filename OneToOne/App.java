package com.venki.OneToOne;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter StreetNo,StreetName,City,State,Country and Pincode");
        
        Address address=new Address(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
    
        System.out.println("Enter the sname,smarks,sage");
        Student student=new Student(sc.next(),sc.nextInt(),sc.nextInt(),address);
    
     SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
     Session session=factory.openSession();
     Transaction transaction=session.beginTransaction();
     session.persist(student);
     transaction.commit();
     session.close();
     factory.close();
     sc.close();
    }
}
