package com.bookList.service;

import com.bookList.pojo.Book;
import com.bookList.pojo.query.BookQuery;
import com.github.pagehelper.PageInfo;



public interface BookService {

    PageInfo<Book> listBookByName(BookQuery bookQuery);

    Book findBookById(Integer id);

    boolean updateBook(Book book);

    boolean addBook(Book book);

    boolean deleteBook(Integer id);

}
