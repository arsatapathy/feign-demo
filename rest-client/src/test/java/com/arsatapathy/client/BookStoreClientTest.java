package com.arsatapathy.client;

import org.junit.Assert;
import org.junit.Test;

public class BookStoreClientTest {

    @Test
    public void test_01() {
        Assert.assertEquals("{\"isbn\":\"93-90491-62-2-11\",\"edition\":11,\"name\":\" Java The Complete Reference\",\"publisher\":\"MC Graw Hill\",\"author\":\"Herbert Schildt\"}", new BookStoreClientApp().getBookStoreClient().getBookByIsbn("93-90491-62-2-11").body().toString());
    }

}
