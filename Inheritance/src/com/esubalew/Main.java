package com.esubalew;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5, 5);
        Dog dog = new Dog("Buch", 3, 5, 6, 6, 16, 5, "has coat");

        dog.eat();
        dog.move(5);
        dog.walk();
        dog.run();
    }
}
