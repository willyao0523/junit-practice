package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void standardAssertions() {
        assertEquals(2, 2);
        assertTrue(true, "The optional assertion message is now the last parameter");
        assertFalse(false, () -> "Really " + "expensive " + "message" + ".");
    }

    @Test
    void groupedAssertions() {
        Address address = new Address("John", "Smith");
        assertAll("address",
                () -> assertEquals("John", address.getFirstName()),
                () -> assertEquals("Smith", address.getLastName()));
    }

    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("a message");
                });
        assertEquals("a message", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        assertTimeout(Duration.ofMinutes(2), () -> {});
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(Duration.ofMillis(10), () -> {
//            Thread.sleep(100);
        });
    }

    @Test
    void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(Duration.ofMinutes(1), () -> {
            return "hi there";
        });
        assertEquals("hi there", actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod() {
        String actualGreeting = assertTimeout(Duration.ofMinutes(1), AssertionsTest::greeting);
        assertEquals("hello world", actualGreeting);
    }

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    private static String greeting() {
        return "hello world";
    }
}
