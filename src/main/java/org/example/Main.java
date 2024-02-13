package org.example;

import org.example.Config.FactoryConfiguration;
import org.example.Entity.Author;
import org.example.Entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        List<Book>books = new ArrayList<>();
//        Author author = new Author("A001","Author 1","UK",books);
//        Author author2 = new Author("A002","Author 2","USA",books);
//        Author author3 = new Author("A003","Author 3","AUS",books);
//        Author author4 = new Author("A004","Author 4","IND",books);
//
//        Book book = new Book("B001","Book 1","2010",100.0,author);
//        Book book2 = new Book("B002","Book 2","2008",200.0,author2);
//        Book book3 = new Book("B003","Book 3","2012",300.0,author);
//        Book book4 = new Book("B004","Book 4","2013",400.0,author3);
//        Book book5 = new Book("B005","Book 5","2014",500.0,author3);
//        Book book6 = new Book("B006","Book 6","2009",600.0,author4);
//
//        books.add(book);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//        books.add(book5);
//        books.add(book6);
//
//        session.save(author);
//        session.save(author2);
//        session.save(author3);
//        session.save(author4);
//
//        session.save(book);
//        session.save(book2);
//        session.save(book3);
//        session.save(book4);
//        session.save(book5);
//        session.save(book6);




        /* Q (1) */
//        Query query = session.createQuery("FROM Book WHERE published_year > '2010'");
//        List<Book> books = query.list();
//        for (Book book : books) {
//            System.out.println("Id: " + book.getId() + " Title: " + book.getTitle() + " Published Year: " + book.getPublished_year() + " Price: " + book.getPrice());
//        }

//        /* Q (2) */
//        Query query = session.createQuery("UPDATE Book SET price = price * 1.1 WHERE id = :id");
//        query.setParameter("id", "B001");
//        int rowCount = query.executeUpdate();
//        System.out.println("Number of books updated: " + rowCount);

        /* Q (3) */
//        Query query = session.createQuery("DELETE FROM Book WHERE author = :author_Id");
//        query.setParameter("id", "A002");
//        int rowCount = query.executeUpdate();
//        System.out.println("Number of authors deleted: " + rowCount);

//        /* Q (4) */
//        Query query = session.createQuery("SELECT AVG (price) from Book");
//        Double avg = (Double) query.uniqueResult();
//        System.out.println("Average Price: "+avg);

        /* Q (5) */
//        Query query = session.createQuery("SELECT a.id, COUNT(b.id) FROM Author a JOIN Book b on a.id = b.author.id GROUP BY a.id");
//        List<Object[]> authors = query.list();
//        for (Object[] author : authors) {
//            System.out.println("Author Id: " + author[0] + " Book Count: " + author[1]);
//        }

        /* Q (6) */
//        Query query = session.createQuery("SELECT b FROM Book b JOIN b.author a WHERE a.country = :country");
//        query.setParameter("country","UK");
//        int rowCount = query.list().size();
//        System.out.println("Number of books published in UK: " + rowCount);

        /* Q (10) */
//        Query query = session.createQuery("SELECT a.name FROM Author a WHERE ( SELECT COUNT(b.id) FROM Book b WHERE a.id = b.author.id ) > ( SELECT AVG(authorBookCount) FROM ( SELECT COUNT(b.id) AS authorBookCount FROM Book b GROUP BY b.author.id ))");
//        List<Object> authors = query.list();
//        for (Object author : authors) {
//            System.out.println("Author: " + author);
//        }


        transaction.commit();
        session.close();
    }
}