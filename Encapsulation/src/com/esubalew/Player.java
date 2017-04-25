package com.esubalew;

/**
 * Created by Esubalew on 25/04/17.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");

        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
