package com.esubalew;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


       int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was:"+ highScore);


        highScore = calculateScore(true, 10000,8, 200);
        System.out.println("Your final score was:"+ highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Abebe", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Getachew", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kassa", highScorePosition);

        highScorePosition = calculateHighScorePosition(70);
        displayHighScorePosition("Satenaw", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Esubalew", highScorePosition);
    }

    //Challenge



    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name + " managed to get into position: "
                + highScorePosition + " on the highscore table");

    }

    public static int calculateHighScorePosition(int score){
    if (score >= 1000) {
        return 1;
     }
    else if(score >= 500 && score < 1000){
        return 2;
     }
     else if(score >= 100 && score < 500){

        return 3;
    }
    else {

        return 4;
     }
    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 2000;
            return finalScore;
        }
        else {

            return 0;
        }
    }




}
