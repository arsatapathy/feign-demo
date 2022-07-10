package com.arsatapathy.client;

import feign.Param;
import feign.RequestLine;
import feign.Response;

public interface BookStoreClient {
    @RequestLine("GET /books/book/{isbn}")
    Response getBookByIsbn(@Param("isbn") String isbn);
}


