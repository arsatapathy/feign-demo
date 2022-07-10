package com.arsatapathy.service;

import com.arsatapathy.model.Book;
import com.arsatapathy.repo.BookStoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookStoreService {

    private final BookStoreRepo bookStoreRepo;

    @Autowired
    public BookStoreService(BookStoreRepo bookStoreRepo) {
        this.bookStoreRepo = bookStoreRepo;
    }

    public Optional<Book> getBookByIsbn(String isbn) {
        return bookStoreRepo.getBookByIsbn(isbn);
    }
}
