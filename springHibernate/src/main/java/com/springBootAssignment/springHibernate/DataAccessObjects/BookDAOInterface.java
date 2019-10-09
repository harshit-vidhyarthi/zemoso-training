package com.springBootAssignment.springHibernate.DataAccessObjects;

import com.springBootAssignment.springHibernate.Entities.Book;

import java.util.List;

public interface BookDAOInterface {
    public List<Book> allbooks();
    public Book bookById(int id);
    public void saveBook(Book book);
    public void deleteBookById(int id);
}
