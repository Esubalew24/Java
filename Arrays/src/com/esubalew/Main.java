package com.esubalew;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] myVariable = {1, 3, 4, 2, 5 ,6, 7, 8, 9, 1};
        // myVariable[1] = 50;
        // myVariable[5] = 10;

        int[] myNewArray = new int[10];
        for(int i=0; i < myIntegers.length; i++){
            myNewArray[i] = i * 10;
            System.out.println( "Element " + i + " typed Value is, " + myIntegers[i]);
        }
        System.out.println("The average is: " + getAverage(myIntegers));

        System.out.println("My new number: 5" + myNewArray[4]);



        double[] myDoubleArray = new double[5];
        myDoubleArray[3] = 100;

        System.out.println(myVariable[1]);
        System.out.println(myVariable[5]);
        System.out.println(myVariable[9]);

        System.out.println(myDoubleArray[3]);

    }
    
    public static void printArray(int[] array) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", value was " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i=0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];

        }
        return (double) sum / (double) array.length;
    }
}
