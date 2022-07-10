package com.arsatapathy.repo;

import com.arsatapathy.model.Book;

import java.util.Optional;

public interface BookStoreRepo {
    Optional<Book> getBookByIsbn(String isbn);
}
