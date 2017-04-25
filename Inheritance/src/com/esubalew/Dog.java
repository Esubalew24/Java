package com.esubalew;

/**
 * Created by Esubalew on 24/04/17.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    private static void chew(){

        System.out.println("Dog.chew() is called");
    }

    public void walk(){
        System.out.println("dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("dog.run() is called");
        move(10);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }
}
