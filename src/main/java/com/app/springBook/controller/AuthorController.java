package com.app.springBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.springBook.entity.Author;
import com.app.springBook.service.AuthorService;

@Controller
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    private String listAuthors(Model model){
        model.addAttribute("authors", authorService.findAllAuthors());
        return "authors";
    }

    @GetMapping("/remove-author/{id}")
    public String removeAuthor(@PathVariable Long id, Model model){
        authorService.deleteAuthor(id);
        model.addAttribute("authors", authorService.findAllAuthors());
        return "authors";
    }

    @GetMapping("/update-author/{id}")
    public String updateAuthor(@PathVariable Long id, Model model){
        model.addAttribute("author", authorService.findAuthorById(id));
        return "update-author";
    }

    @PostMapping("/update-author/{id}")
    public String saveUpdateAuthor(@PathVariable Long id, Author author, BindingResult result, Model model){
        if(result.hasErrors()){
            return "update-author";
        }
        authorService.updateAuthor(author);
        model.addAttribute("authors", authorService.findAllAuthors());
        return "redirect:/authors";
        
    }

    @GetMapping("/add-author")
    public String showCreateAuthor(Author author){
        return "add-author";
    }

    @PostMapping("/save-author")
    public String saveAuthor(Author author, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-author";
        }

        authorService.createAuthor(author);
        model.addAttribute("author", authorService.findAllAuthors());
        return "redirect:/authors";
    }
    
}
