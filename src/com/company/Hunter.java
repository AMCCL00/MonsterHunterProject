package com.company;

import java.util.Scanner;

public class Hunter{
    Scanner input = new Scanner(System.in);
    private String name;
    private int health;
    private int playerDamage;

    public Hunter() {
        this.name = name;
        this.health = 1000;
        this.playerDamage = playerDamage;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("What is your name Hunter?");
        input.nextLine();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }
}
