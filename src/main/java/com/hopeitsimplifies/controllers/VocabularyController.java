package com.hopeitsimplifies.controllers;

import com.hopeitsimplifies.BookSystem.models.Book;
import com.hopeitsimplifies.BookSystem.models.Vocabulary;
import com.hopeitsimplifies.BookSystem.services.BookService;
import com.hopeitsimplifies.BookSystem.services.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/vocabularies")
public class VocabularyController {

    @Autowired
    private VocabularyService vocabularyService;

    @GetMapping({"","/"})
    public String showVocabularyList(Model model) {
        List<Vocabulary> vocabularies = vocabularyService.findAll();
        model.addAttribute("vocabularies", vocabularies);
        return "vocabularies/index";
    }

}
