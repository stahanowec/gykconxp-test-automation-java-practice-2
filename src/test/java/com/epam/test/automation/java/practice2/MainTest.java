package com.epam.test.automation.java.practice2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class MainTest {
    @Test(dataProvider = "task1DataProvider")
    public void ifTask1ThenSuccess(int currentValue, int expectedValue) {
        //given
        var current = currentValue;
        var expected = expectedValue;
        //when
        var result = Main.task1(current);
        //then
        assertEquals(result, expected);
    }

    @Test
    public void ifTask10ThenIllegalArgumentException() {
        //given
        var current = 0;
        //when
        //then
        assertThrows(IllegalArgumentException.class, ()-> Main.task1(current));
    }

    @Test(dataProvider = "task2DataProvider")
    public void ifTask2ThenSuccess(int currentValue, int expectedValue) {
        //given
        var current = currentValue;
        var expected = expectedValue;
        //when
        var result = Main.task2(current);
        //then
        assertEquals(result, expected);
    }

    @Test(dataProvider = "task2NegativeProvider")
    public void ifTask20ThenIllegalArgumentException(int currentValue) {
        //given
        var current = currentValue;
        //when
        //then
        assertThrows(IllegalArgumentException.class, ()-> Main.task2(current));
    }

    @Test(dataProvider = "task3DataProvider")
    public void ifTask3ThenSuccess(int currentValue, int expectedValue) {
        //given
        var current = currentValue;
        var expected = expectedValue;
        //when
        var result = Main.task3(current);
        //then
        assertEquals(result, expected);
    }

    @Test
    public void ifTask3ThenThrowIllegalArgumentException() {
        //given
        var current = -5;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> Main.task3(current));
    }

    @DataProvider(name = "task1DataProvider")
    public static Object[][] task1DataProvider() {
        return new Object[][]{{1234, 4}, {246, 0}};
    }

    @DataProvider(name = "task2DataProvider")
    public static Object[][] task2DataProvider() {
        return new Object[][]{{14, 3}, {128, 1} };

    }

    @DataProvider(name = "task3DataProvider")
    public static Object[][] task3DataProvider() {
        return new Object[][]{
                {8, 33},
                {11, 143},
                {1, 0}};
    }

    @DataProvider(name = "task2NegativeProvider")
    public static Object[] task2NegativeProvider() {
        return new Object[]{0, -1};

    }
}