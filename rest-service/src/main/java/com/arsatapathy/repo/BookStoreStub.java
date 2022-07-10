package com.arsatapathy.repo;

import com.arsatapathy.model.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Repository
public class BookStoreStub implements BookStoreRepo {

    private Map<String, Book> books = new HashMap<>();

    public BookStoreStub() {
        books.put(
                "93-90491-62-2-8",
                Book.builder()
                        .isbn("93-90491-62-2-8")
                        .edition(8)
                        .name(" Java The Complete Reference")
                        .author("Herbert Schildt")
                        .build()
        );

        books.put(
                "93-90491-62-2-9",
                Book.builder()
                        .isbn("93-90491-62-2-9")
                        .edition(9)
                        .name(" Java The Complete Reference")
                        .author("Herbert Schildt")
                        .build()
        );

        books.put(
                "93-90491-62-2-11",
                Book.builder()
                        .isbn("93-90491-62-2-11")
                        .edition(11)
                        .name(" Java The Complete Reference")
                        .author("Herbert Schildt")
                        .publisher("MC Graw Hill")
                        .build()
        );

    }

    @Override
    public Optional<Book> getBookByIsbn(String isbn) {
        Book book = books.get(isbn);

        return Objects.isNull(book) ? Optional.empty() : Optional.of(book);
    }
}
