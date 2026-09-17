package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private final Calculator c = new Calculator();

    @Test void add() { assertEquals(5, c.calculate("add", 2, 3)); }
    @Test void subtract() { assertEquals(3, c.calculate("subtract", 5, 2)); }
    @Test void multiply() { assertEquals(12, c.calculate("multiply", 3, 4)); }
    @Test void divideNormal() { assertEquals(4, c.calculate("divide", 8, 2)); }
    @Test void divideByZero() {
        assertThrows(ArithmeticException.class, () -> c.calculate("divide", 8, 0));
    }
    @Test void mod() { assertEquals(1, c.calculate("mod", 7, 3)); }
    @Test void unknownOperation() {
        assertThrows(IllegalArgumentException.class, () -> c.calculate("power", 2, 3));
    }
}
