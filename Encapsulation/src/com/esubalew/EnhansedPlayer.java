package com.esubalew;

/**
 * Created by Esubalew on 25/04/17.
 */
public class EnhansedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhansedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <=100){
            this.hitPoints = health;
        }
        this.hitPoints = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");

        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
