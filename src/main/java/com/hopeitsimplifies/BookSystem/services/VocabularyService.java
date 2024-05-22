package com.hopeitsimplifies.BookSystem.services;

import com.hopeitsimplifies.BookSystem.models.Book;
import com.hopeitsimplifies.BookSystem.models.Vocabulary;
import com.hopeitsimplifies.BookSystem.repository.VocabulariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VocabularyService {
    @Autowired
    private VocabulariesRepository vocabulariesRepository;
    public List<Vocabulary> findAll() {
        return vocabulariesRepository.findAll();
    }

}
