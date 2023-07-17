package org.example;

import org.junit.jupiter.api.*;

public class LifecycleJunit5Test {

    @BeforeAll
    static void setupAll() {
        System.out.println("Setup all tests in the class");
    }

    @BeforeEach
    void setup() {
        System.out.println("Setup each test in the class");
    }

    @Test
    void testOne() {
        System.out.println("Test 1");
    }

    @Test
    void testTwo() {
        System.out.println("Test 2");
    }

    @AfterEach
    void teardown() {
        System.out.println("Teardown each test in the class");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("Teardown all tests in the class");
    }
}
