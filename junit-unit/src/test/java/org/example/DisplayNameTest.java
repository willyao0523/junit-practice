package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
public class DisplayNameTest {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {

    }

    @Test
    @DisplayName("(** ^_^ **)")
    void testWithDisplayNameContainingSpecialCharacters() {

    }

    @Test
    @DisplayName("😄")
    void testWithDisplayNameContainingEmoji() {

    }
}
