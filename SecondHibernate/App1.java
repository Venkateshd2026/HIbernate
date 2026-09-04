package com.venki.SecondHIbernate;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        System.out.println("Enter the id to fetch the book details:");
        Book book = session.get(Book.class, sc.nextInt());// Here session.get() is used to collect the data from the database Boook.class is from which class data need to be retrive
        if (book != null) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Name: " + book.getName());
            System.out.println("Book Price: " + book.getPrice());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Book Publisher: " + book.getPublisher());
        } else {
            System.out.println("Book not found");
        }
        session.close();
        factory.close();
        sc.close();
    }
}
