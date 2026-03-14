package com.klu.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.klu.model.Library;

@Service
public class LibraryService {

    private List<Library> bookList = new ArrayList<>();

    public String welcome() {
        return "Welcome to Online Library System!";
    }

    public int countBooks() {
        return 150;
    }

    public double getPrice() {
        return 499.99;
    }

    public List<String> getBookTitles() {
        List<String> titles = new ArrayList<>();
        titles.add("Java Programming");
        titles.add("Spring Boot Guide");
        titles.add("Data Structures");
        return titles;
    }

    public String getBookById(int id) {
        return "Details of Book with ID: " + id;
    }

    public String searchBook(String title) {
        return "Searching for book: " + title;
    }

    public String getAuthor(String name) {
        return "Books written by author: " + name;
    }

    public String addBook(Library book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    public List<Library> viewBooks() {
        return bookList;
    }
}
