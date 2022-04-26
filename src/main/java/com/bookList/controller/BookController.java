package com.bookList.controller;

import com.bookList.pojo.Book;
import com.bookList.pojo.query.BookQuery;
import com.bookList.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/")
    public String index(Model model, BookQuery bookQuery) {
        PageInfo<Book> bookPageInfo = bookService.listBookByName(bookQuery);
        model.addAttribute("books", bookPageInfo);
        return "index";
    }

    @PostMapping("/")
    public String listBookByName(Model model, BookQuery bookQuery) {
        PageInfo<Book> bookPageInfo = bookService.listBookByName(bookQuery);
        model.addAttribute("books", bookPageInfo);
        return "index";
    }

    @GetMapping("/update/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("book", bookService.findBookById(id));
        return "updateBook";
    }

    @PostMapping("/update")
    public String update(Book book, RedirectAttributes attributes) {
        boolean flag = bookService.updateBook(book);
        if (flag) {
            attributes.addFlashAttribute("message", "更新成功");
            return "redirect:/";
        } else {
            attributes.addFlashAttribute("message", "更新失敗");
            return "redirect:/";
        }
    }

    @GetMapping("/add")
    public String add() {
        return "addBook";
    }

    @PostMapping("/add")
    public String addBook(Book book, RedirectAttributes attributes) {
        boolean flag = bookService.addBook(book);
        if (flag) {
            attributes.addFlashAttribute("message", "新增成功");
            return "redirect:/";
        } else {
            attributes.addFlashAttribute("message", "新增失敗");
            return "redirect:/";
        }

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
        boolean flag = bookService.deleteBook(id);
        if (flag){
            attributes.addFlashAttribute("message","刪除成功");
            return "redirect:/";
        }else{
            attributes.addFlashAttribute("message","刪除失敗");
            return "redirect:/";
        }

    }

}
