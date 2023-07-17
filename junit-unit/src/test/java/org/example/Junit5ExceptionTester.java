package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Junit5ExceptionTester {

    private final Calculator calculator = new Calculator();

    @Test
    public void exceptionIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1));
    }

    @Test
    public void expectArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}
