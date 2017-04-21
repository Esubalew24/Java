package com.esubalew;

public class Main {

    public static void main(String[] args) {
	// Operators

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result *10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result/ 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result ++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAllien = true;
        if( isAllien == true)
            System.out.println("Yes It is an allien");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the high score");

        int secTopScore = 81;
        if(topScore > secTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        if((topScore>90)|| (secTopScore <= 90));
        System.out.println(" One of these testes are true! ");

        int newValue = 50;
        if(newValue == 50);
        System.out.println("This is true!");

        boolean isCar = false;
        if(isCar ==true);
        System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        System.out.println("wasCar is true");

        // Challenge

        double doubleVriable = 20;
        double secVariable = 80;

        double total = doubleVriable + secVariable * 25;
        System.out.println("My total was: " + total);
        double remainder = total % 40;
        System.out.println("The remainder is: " + remainder);
        if(remainder <=20);
        System.out.println("Total was over the limit!");





    }
}
