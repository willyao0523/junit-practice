package org.example;

import org.junit.jupiter.api.*;

public class TestInfoTest {

    @BeforeEach
    void init(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        System.out.printf("@BeforeEach %s %n", displayName);
    }

    @Test
    @DisplayName("My Test")
    @Tag("my-tag")
    void testOne(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }

    @Test
    void testTwo() {

    }
}
