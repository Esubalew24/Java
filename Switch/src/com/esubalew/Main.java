package com.esubalew;

import java.time.temporal.ValueRange;

public class Main {

    public static void main(String[] args) {

        // If statement
        int value = 2;
        if (value == 1){
            System.out.println("Value is 1");
        }
        else {
            System.out.println("Value was not 1 or 2");
        }

        //Switch Statement

        int Switchvalue = 30;
        switch(Switchvalue){
            case 10:
                System.out.println("Value is 10");
                break;

            case 20:
                System.out.println("Value is 10 or 20");
                break;

            case 30:case 40:case 60:
                System.out.println("This is multiple case statement");
                System.out.println("Values are either 30, or 40, or 60");
                break;

            default:
                System.out.println("Was not 10 or 20");
                break;

        }
    // Challenge

        char charvariable = 'H';
        switch (charvariable){
            case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C':
                System.out.println("The letter is C");
                break;
            case 'D':case 'E':
                System.out.println("Letter is either D or E");
                break;
            default:
                System.out.println("Letter is not found");
                break;

        }

      // Switch statment is case sensitive
        String month = "January";
        switch (month){
            case "january":
                System.out.println("Month is January");
                break;
            default:
                System.out.println("I don't know the month");
                break;
        }

    }
}
