package com.esubalew;

/**
 * Created by Esubalew on 26/04/17.
 */
public class DeluxeBurger extends Hamburger {
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to aa deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to aa deluxe burger");

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to aa deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to aa deluxe burger");
    }


    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);




    }
}
