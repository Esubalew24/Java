package com.esubalew;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2 % interest = " + calculateInterest(1000.0, 2.0));
        System.out.println("10,000 at 3 % interest = " + calculateInterest(1000.0, 3.0));
        System.out.println("10,000 at 4 % interest = " + calculateInterest(1000.0, 4.0));
        System.out.println("10,000 at 5 % interest = " + calculateInterest(1000.0, 5.0));

        for(int i = 0;i < 5; i++ ){
            System.out.println("loop " + i + " hello");

        }

        // Chalenge 1

        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "  % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // Challenge 2
        System.out.println("Counting downwards: ");

        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "  % interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // counts the first 10 Prime Number

        int count = 0;
        for( int i = 1; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }
    }


    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate /100));

        }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }




}
