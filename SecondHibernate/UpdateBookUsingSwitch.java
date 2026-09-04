package com.venki.SecondHIbernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDataUsingCondition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        System.out.println("Enter the book id to update:");

        int id = sc.nextInt();

        Book book = session.get(Book.class, id);

        if (book != null) {

            while (true) {

                System.out.println("\nPress 1 to update book name");
                System.out.println("Press 2 to update book price");
                System.out.println("Press 3 to update book author");
                System.out.println("Press 4 to update book publisher");
                System.out.println("Press 5 to exit");

                int choice = sc.nextInt();

                if (choice == 5) {
                    break;
                }

                switch (choice) {

                case 1:
                    System.out.println("Enter the name to update:");
                    book.setName(sc.next());
                    System.out.println("Book name updated successfully.");
                    break;

                case 2:
                    System.out.println("Enter the price to update:");
                    book.setPrice(sc.nextInt());
                    System.out.println("Book price updated successfully.");
                    break;

                case 3:
                    System.out.println("Enter the author to update:");
                    book.setAuthor(sc.next());
                    System.out.println("Book author updated successfully.");
                    break;

                case 4:
                    System.out.println("Enter the publisher to update:");
                    book.setPublisher(sc.next());
                    System.out.println("Book publisher updated successfully.");
                    break;

                default:
                    System.out.println("Invalid option.");
                }
            }

            transaction.commit();

            System.out.println("Changes saved successfully.");

        } else {

            System.out.println("Invalid book id.");
            transaction.rollback();
        }

        session.close();
        factory.close();
        sc.close();
    }
}
