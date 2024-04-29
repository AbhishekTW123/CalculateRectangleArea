package org.example.test;

import org.example.CalculateArea;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {

    private static CalculateArea calculateArea;

    @BeforeEach
    public void setUp() {
        calculateArea = new CalculateArea();
    }

    @Test
    void shouldCalculateRectangleArea() {

        String result = calculateArea.rectangle(10F, 20F);
        assertEquals("200.0", result);
    }

    @Test
    void shouldCheckInvalidLength() {

        String result = calculateArea.rectangle(-10F, 20F);
        assertEquals("length is less than or equal to 0", result);
    }

    @Test
    void shouldCheckInvalidWidth() {

        String result = calculateArea.rectangle(10F, -20F);
        assertEquals("width is less than or equal to 0", result);
    }


}