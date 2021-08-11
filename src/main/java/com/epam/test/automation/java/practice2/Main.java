package com.epam.test.automation.java.practice2;

public class Main {

    public static int task1(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        var stringValues = String.valueOf(value);
        var sum = 0;
        for (int i = 0; i < stringValues.length(); i++) {
            var charAt = (int) stringValues.charAt(i) - '0';
            if (charAt % 2 != 0) {
                sum += charAt;
            }
        }
        return sum;
    }

    public static int task2(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
        var binaryString = Integer.toBinaryString(value);
        var sum = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            var charAt = (int) binaryString.charAt(i) - '0';
            sum += charAt;
        }
        return sum;
    }

    public static int task3(int value) {
        if (value != 1) {
            if (value > 0) {
                int[] fiboArray = new int[value];
                fiboArray[0] = 0;
                fiboArray[1] = 1;
                var sum = 0;
                for (int i = 2; i < value; i++) {
                    fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
                }

                for (int j : fiboArray) {
                    sum += j;
                }
                return sum;
            } else if (value < 0) {
                throw new IllegalArgumentException();
            }
        }
        return 0;
    }
}
