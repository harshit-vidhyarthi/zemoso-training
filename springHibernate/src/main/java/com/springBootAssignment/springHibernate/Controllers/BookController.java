package com.springBootAssignment.springHibernate.Controllers;

import com.springBootAssignment.springHibernate.Entities.Book;
import com.springBootAssignment.springHibernate.ServiceLayer.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class BookController {
    //book service object
    private BookService bookService;

    //constructor dependency injection through autowired
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //return books list at "/books" by get mapping
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.allbooks();
    }

    //return book by book id
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        Book book = bookService.bookById(id);
        if(book == null) {
            System.out.println("Book not found");
        }
        return book;
    }

    //mapping to add new book via post request
    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    //mapping to delete a book
    @DeleteMapping("books/{id}")
    public void deleteBook(@PathVariable int id) {
        Book book = getBook(id);
        if(book == null) {
            System.out.println("Book not found");
        }
        else {
            bookService.deleteBookById(id);
        }
    }
}
