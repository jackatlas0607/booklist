package com.bookList.dao;

import com.bookList.pojo.Book;
import com.bookList.pojo.query.BookQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookDao {

    //查詢書名並分頁展示and展示所有書籍
    List<Book> listBookByName(BookQuery bookQuery);

    //根據id查詢書籍
    Book findBookById(Integer id);


    //修改書籍
    int updateBook(Book book);


    //新增書籍
    int addBook(Book book);

    //根據id刪除書籍
    int deleteBook(Integer id);
}
