package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1_000;
        int number1 = -1234567890;

        //Minimum and Maximum numbers in int data type
        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        System.out.println(myValue);

        // Byte Data type
        // Byte has a width of 8

        byte minByteNumber = -128;
        byte maxByteNumber = 127;
        byte someNumber = (byte) (maxByteNumber/2);
        System.out.println(someNumber);

        //Short Data type
        //Short has a width of 16
        short minShortNumber = -32768;
        short maxShortNumber = 32767;
        short shortNumber = (byte)(minShortNumber/4);
        System.out.println(shortNumber);

        //Long min and max value
        // Long has a width of 64
        long minLongNumber = -9_223_372_036_854_775_808L;
        long maxLongNumber = 9_223_372_036_854_775_807L;

        // Create a variable of type long, and make it equal to 5000 + 10 times the sum of the byte, plus the short plus the int.
        byte byteNumber = 12;
        short shortNum = 500;
        int integerNumber = 100;

        long solution =  5000 + 10 * (byteNumber + shortNum + integerNumber);
        System.out.println("Total= " + solution);
    }
}