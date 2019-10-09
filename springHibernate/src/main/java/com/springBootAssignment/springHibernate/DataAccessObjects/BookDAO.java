package com.springBootAssignment.springHibernate.DataAccessObjects;

import com.springBootAssignment.springHibernate.Entities.Book;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookDAO implements BookDAOInterface{

    //entity manager definition
    private EntityManager entityManager;

    //constructor dependency injection through autowired
    @Autowired
    public BookDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> allbooks() {
        //get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        //Query to return all books
        Query<Book> query = session.createQuery("from Book", Book.class);

        List<Book> books = query.getResultList();

        return books;
    }

    @Override
    public Book bookById(int id) {
        //get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        //get book by id
        Book book = session.get(Book.class, id);

        return book;
    }

    @Override
    public void saveBook(Book book) {
        //get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(book);
    }

    @Override
    public void deleteBookById(int id) {
        //get current hibernate session
        Session session = entityManager.unwrap(Session.class);

        //delete book by id
        Query query = session.createQuery("delete from Book where id=:id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
