package com.venki.ManyToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Club c1 = new Club("volleyball");
        Club c2 = new Club("volleyball1");
        Club c3 = new Club("volleyball2");
        Student s1 = new Student("Venki", "venki@gmail.com");
        Student s2 = new Student("Venki1", "1venki@gmail.com");
        Student s3 = new Student("Venki2", "2venki@gmail.com");
        s1.addClub(c1);
        s1.addClub(c2);
        s1.addClub(c3);

        s2.addClub(c2);
        s2.addClub(c3);

        s3.addClub(c1);
        s3.addClub(c3);

        session.persist(c1);
        session.persist(c2);
        session.persist(c3);

        session.persist(s1);
        session.persist(s2);
        session.persist(s3);

        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Data saved successfully!");
    }
}
