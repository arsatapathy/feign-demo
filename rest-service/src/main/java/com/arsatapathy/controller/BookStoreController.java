package com.arsatapathy.controller;

import com.arsatapathy.model.Book;
import com.arsatapathy.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookStoreController {

    private final BookStoreService bookStoreService;

    @Autowired
    public BookStoreController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    @GetMapping("/")
    public String healthCheck() {
        return "GREEN";
    }


    @GetMapping("/books/book/{isbn}")
    public Optional<Book> getBookByIsbn(@PathVariable String isbn) {
        return bookStoreService.getBookByIsbn(isbn);
    }

}
