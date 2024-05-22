package com.hopeitsimplifies.BookSystem.services;

import com.hopeitsimplifies.BookSystem.models.Book;
import com.hopeitsimplifies.BookSystem.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    // Các phương thức khác như findById, save, delete, etc.
}