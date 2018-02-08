package com.company;

public class Monster {
    private String name;
    private int Health;

    public Monster(String name, int health) {
        this.name = name;
        Health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }
}
