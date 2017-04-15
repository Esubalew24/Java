package com.company;

public class Main {

    public static void main(String[] args) {
	// Strings

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more string.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9";
        System.out.println("myString is equal to " + myString);

        String numberString = "333.5443";
        numberString = numberString + "32.4443";
        System.out.println("This is string number: " + numberString);

        String someString = "200";
        int number = 10000;
        someString  = someString + number;
        System.out.println("SomeString will be: " + someString);
        double doubleNumber = 1232.323;
        someString = someString + doubleNumber;
        System.out.println(" Output Value will be: " + someString);
    }
}
