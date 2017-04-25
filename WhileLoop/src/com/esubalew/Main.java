package com.esubalew;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while ( count != 6){

            System.out.println("Count Value is " + count);
            count++;
        }

        count = 1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("Value is " + count);
            count++;
        }


        count = 1;
        do {
            System.out.println("Value is " + count);
            count++;
            if(count >=100){
                break;
            }
        } while (count != 6);


        // Challenge 1

        int number = 5;
        int finishNumber = 20;
        int evenNumberFound = 0;
        while (number <= finishNumber){
            if(!isEvenNUmber(number)){
                number++;
                continue;
            }


            System.out.println( number + " is even number");
            number++;

            evenNumberFound++;
            if(evenNumberFound >=5){
                break;
            }
        }
        System.out.println("Totla even numbers found = " + evenNumberFound);
    }

    public static boolean isEvenNUmber(int number){
        if((number % 2) == 0){
        return true;
        }
        else {
            return false;
        }
    }
}
