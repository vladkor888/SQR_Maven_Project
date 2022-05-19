package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"interval 200-300, 200, 300, 3",
            "interval 100-500, 100, 500, 12",
            "interval 500-700, 100, 500, 12"})
    void shouldCalculateSqrNumber(String testName, int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSqrNumber(minValue, maxValue);
assertEquals(expected, actual);
    }
    }
