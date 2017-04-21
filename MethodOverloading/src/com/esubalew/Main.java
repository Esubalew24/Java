package com.esubalew;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Esubalew", 100);
        System.out.println("New Score is: " + newScore);

        calculateScore("Esub", 500);
        calculateScore(200);
        calculateScore();

        }


    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){

        System.out.println("No Player name, No player score");
        return 0;
    }

    // Challenge

    public static double calcFeetAndInchesToCentimeters(double feet , double inches){
       if((feet < 0) || (inches < 0 && inches >12)) {
           return -1;
       }

       double centimeter = (feet * 12) * 2.54;
       centimeter +=inches *2.54;
        System.out.println(feet + " feet, " + inches + " inches= " + centimeter + " cm");
        return 2;
    }

    public static void calcFeetAndInchesToCentimeters(int inches){


    }

}
