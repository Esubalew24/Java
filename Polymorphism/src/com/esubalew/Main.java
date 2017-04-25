package com.esubalew;

import javax.print.DocFlavor;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
 class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return  " A shark eats lots of fishes";
    }
 }

 class IndependenceDay extends Movie {
     public IndependenceDay() {
         super("Indepencence day");
     }

     @Override
     public String plot() {
         return "Alliens attempt to take over human";
     }
 }

 class MazeRunner extends Movie {
     public MazeRunner() {
         super("MAze Runner");
     }

     @Override
     public String plot() {
         return "Kids try and escape a maze";

     }
 }

     class StarWars extends Movie {

         public StarWars() {
             super("Star Wars");
         }

         @Override
         public String plot() {
             return "Imperial Forces to take over universe";
         }
     }

     class Forgatable extends  Movie {

         public Forgatable() {
             super("Frgatable");
         }
     }


public class Main {

    public static void main(String[] args) {
	     for(int i = 1; i<11; i++)  {
	         Movie movie = randomMovie();
             System.out.println(" Movie #" + i + ":" + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }


    }

     public static Movie randomMovie (){

        int randomNumber = (int) (Math.random() * 5) + 1;
         System.out.println(" Random Number was generated: " + randomNumber);
         switch (randomNumber){

             case 1:
                 return new Jaws();
             case 2:
                 return new IndependenceDay();
             case 3:
                 return new MazeRunner();
             case 4:
                 return new StarWars();
             case 5:
                 return new Forgatable();


         }

            return null;
     }

}
