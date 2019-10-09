package com.springBootAssignment.springHibernate.ServiceLayer;

import com.springBootAssignment.springHibernate.DataAccessObjects.BookDAO;
import com.springBootAssignment.springHibernate.Entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService implements BookServiceInterface{

    private BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> allbooks() {
        return bookDAO.allbooks();
    }

    @Override
    @Transactional
    public Book bookById(int id) {
        return bookDAO.bookById(id);
    }

    @Override
    @Transactional
    public void saveBook(Book book) {
        bookDAO.saveBook(book);
    }

    @Override
    @Transactional
    public void deleteBookById(int id) {
        bookDAO.deleteBookById(id);
    }
}
