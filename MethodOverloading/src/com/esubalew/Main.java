package com.esubalew;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Esubalew", 100);
        System.out.println("New Score is: " + newScore);

        calculateScore("Esub", 500);
        calculateScore(200);
        calculateScore();
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(-1,3);
        calcFeetAndInchesToCentimeters(100);

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
       if((feet < 0) || (inches < 0 || inches > 12)) {
           System.out.println("Invalid feet or inch parameter");
           return -1;
       }

       double centimeter = (feet * 12) * 2.54;
       centimeter +=inches *2.54;
        System.out.println(feet + " feet, " + inches + " inches= " + centimeter + " cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    }


