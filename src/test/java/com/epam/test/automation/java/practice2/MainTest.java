package com.epam.test.automation.java.practice2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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

    @DataProvider(name = "task1DataProvider")
    public static Object[][] task1DataProvider() {
        return new Object[][]{{1234, 4}, {246, 0}};
    }

    @DataProvider(name = "task2DataProvider")
    public static Object[][] task2DataProvider() {
        return new Object[][]{{14, 3}, {128, 1}};
    }

    @DataProvider(name = "task3DataProvider")
    public static Object[][] task3DataProvider() {
        return new Object[][]{{8,33},
                {11, 143}};
    }
}