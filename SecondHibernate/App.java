package com.venki.SecondHIbernate;
//import java.lang.module.Configuration;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the name,price,author and publicher");
        Book book=new Book(sc.next(),sc.nextInt(),sc.next(),sc.next());
        Configuration confg=new Configuration();
        confg.configure("hibernate.cfg.xml");
        SessionFactory factory = confg.buildSessionFactory();
        Session session = factory.openSession();
         Transaction trans = session.beginTransaction();
         session.persist(book);
         trans.commit();
         session.close();
         factory.close();
         sc.close();
        
        
    }
} 
