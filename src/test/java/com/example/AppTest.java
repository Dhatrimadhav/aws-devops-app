package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApplicationMessage() {

        String expected = "AWS DevOps Application is Running!";
        String actual = App.getMessage();

        assertEquals(expected, actual);
    }
}
