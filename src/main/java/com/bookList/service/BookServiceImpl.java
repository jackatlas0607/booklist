package com.bookList.service;

import com.bookList.dao.BookDao;
import com.bookList.pojo.Book;
import com.bookList.pojo.query.BookQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public PageInfo<Book> listBookByName(BookQuery bookQuery) {
        PageHelper.startPage(bookQuery.getPageNum(),bookQuery.getPageSize());
        return new PageInfo<Book>(bookDao.listBookByName(bookQuery));
    }

    @Override
    public Book findBookById(Integer id) {
        Book book = bookDao.findBookById(id);
        return book;
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.updateBook(book) > 0 ? true : false;
    }

    @Override
    public boolean addBook(Book book) {
        return bookDao.addBook(book) > 0 ? true : false;
    }

    @Override
    public boolean deleteBook(Integer id) {
        return bookDao.deleteBook(id) > 0 ? true : false;
    }
}
