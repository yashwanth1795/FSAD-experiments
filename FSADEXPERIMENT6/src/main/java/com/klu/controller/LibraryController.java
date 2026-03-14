package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.model.Library;
import com.klu.services.LibraryService;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService service;

    @GetMapping("/welcome")
    public String welcome() {
        return service.welcome();
    }

    @GetMapping("/count")
    public int countBooks() {
        return service.countBooks();
    }

    @GetMapping("/price")
    public double getPrice() {
        return service.getPrice();
    }

    @GetMapping("/books")
    public List<String> getBooks() {
        return service.getBookTitles();
    }

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return service.getBookById(id);
    }

    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return service.searchBook(title);
    }

    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return service.getAuthor(name);
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Library book) {
        return service.addBook(book);
    }

    @GetMapping("/viewbooks")
    public List<Library> viewBooks() {
        return service.viewBooks();
    }
}
