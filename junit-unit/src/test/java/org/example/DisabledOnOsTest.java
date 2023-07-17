package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Os.*;

public class DisabledOnOsTest {

    @DisabledOnOs({MAC, LINUX})
    @Test
    void conditionalTest() {
        System.out.println("This test will be disabled on MAC and LINUX");
    }
}
