package com.arsatapathy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String isbn;
    private int edition;
    private String name;
    private String publisher;
    private String author;
}
