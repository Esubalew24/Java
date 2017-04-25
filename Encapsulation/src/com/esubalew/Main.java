package com.esubalew;

public class Main {

    public static void main(String[] args) {
    /*    Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 12;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

     */

    EnhansedPlayer player = new EnhansedPlayer("Esub", 200, "Sword");
        System.out.println("Initisl health is " + player.getHealth());
    }
}
