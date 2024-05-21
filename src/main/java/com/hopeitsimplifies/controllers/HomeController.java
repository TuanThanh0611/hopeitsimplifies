package com.hopeitsimplifies.controllers;

import com.hopeitsimplifies.BookSystem.models.Book;
import com.hopeitsimplifies.BookSystem.services.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class HomeController {

    @Autowired
    private BooksRepository bookRepository;

    @GetMapping({"","/"})
    public String showBookList(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books/index1";
    }

}
