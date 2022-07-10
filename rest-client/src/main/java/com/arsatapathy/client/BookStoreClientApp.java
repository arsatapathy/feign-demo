package com.arsatapathy.client;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.slf4j.Slf4jLogger;

public class BookStoreClientApp {

    private BookStoreClient bookStoreClient = null;

    public BookStoreClient getBookStoreClient() {
        if (bookStoreClient == null) {
            bookStoreClient = Feign.builder()
                    .decoder(new GsonDecoder())
                    .logger(new Slf4jLogger())
                    .logLevel(Logger.Level.FULL)
                    .target(BookStoreClient.class, "http://localhost:9091");
        }

        return bookStoreClient;
    }

}
