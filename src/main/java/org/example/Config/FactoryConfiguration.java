package org.example.Config;

import org.example.Entity.Author;
import org.example.Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Book.class);
        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance(){
        if (factoryConfiguration==null){
            return new FactoryConfiguration();
        }
        return new FactoryConfiguration();
    }
    public Session getSession(){
       return sessionFactory.openSession();
    }
}
