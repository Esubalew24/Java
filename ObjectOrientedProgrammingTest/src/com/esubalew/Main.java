package com.esubalew;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 1.22);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is: " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentiles", 3.41);
        healthyBurger.itemizedHamburger();

        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger db= new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this ", 50.53);
        db.itemizedHamburger();

    }
}
