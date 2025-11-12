package com.fic.cursoandroid2025g4.controller;

import android.content.Context;

import com.fic.cursoandroid2025g4.model.Book;
import com.fic.cursoandroid2025g4.model.BookDao;
import com.fic.cursoandroid2025g4.model.BookDatabase;


import java.util.List;

public class BookController {

    private final BookDao bookDao;

    public BookController(Context context) {
        BookDatabase database = BookDatabase.getInstance(context);
        bookDao = database.bookDao();
    }

    //Create a book
    public void addBook(String title, String author, String status){
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.status = status;
        bookDao.insert(book);
    }

    //Get all books
    public List<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }

    //Update book
    public void updateBook(Book book){
        bookDao.update(book);
    }

    //Delete book
    public void deleteBook(Book book){
        bookDao.delete(book);
    }
}
