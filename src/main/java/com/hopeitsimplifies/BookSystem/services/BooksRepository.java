package com.hopeitsimplifies.BookSystem.services;

import com.hopeitsimplifies.BookSystem.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book,Integer> {
}
