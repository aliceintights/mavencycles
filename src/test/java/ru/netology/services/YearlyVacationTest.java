package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearlyVacationTest {

    @Test
    public void shouldCalcYearlyVacation() {
        YearlyVacation service = new YearlyVacation();

        int expected = 3;
        int monthCount = 0;
        int threshold = 0;

        int actual = service.calculate(threshold, monthCount);

        Assertions.assertEquals(expected, actual);
    }
}
