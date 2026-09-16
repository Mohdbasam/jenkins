package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        int result = App.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void testAnotherAddition() {
        int result = App.add(5, 15);

        assertEquals(20, result);
    }
}
