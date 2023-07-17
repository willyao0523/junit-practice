package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest {

    @Test
    void assumeTrueTest() {
        assumeTrue(false);
        fail("Test 1 failed");
    }

    @Test
    void assumeFalseTest() {
        assumeFalse(this::getTrue);
        fail("Test 2 failed");
    }

    private boolean getTrue() {
        return true;
    }

    @Test
    void assumingThatTest() {
        assumingThat(false, () -> fail("Test 3 failed"));
    }
}
