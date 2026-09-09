package com.venki.OneTpMany;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Course c1=new Course("Java");
        Course c2=new Course("Python");
        Course c3=new Course("C#");
        Student student=new Student("venki","venki.cse.rymec@gmail.com",7892374);
        c1.setStudent(student);
        c2.setStudent(student);
        c3.setStudent(student);
        List<Course>courses=new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        student.setRef(courses);
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
      factory.close();    
    }
}
