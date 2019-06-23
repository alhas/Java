package com.alhas;

public class Player {


    public String fullName;
    public int health;
    public String weapon;


    public void loseHealth(int damamge){

        this.health = this.health - damamge;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // REduce number of lives remaning for the player
        }

    }

    public int healthRemaining(){
        return this.health;
    }


}
