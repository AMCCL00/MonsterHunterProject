package com.company;

import java.util.Scanner;

public class Hunter {
    private final String weapon;
    Scanner input = new Scanner(System.in);
    private String name;
    private int health;

    public Hunter(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
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
}
