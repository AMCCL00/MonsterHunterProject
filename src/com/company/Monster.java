package com.company;

public class Monster {
    private String name;
    private int Health;
    private int monsterDamage;
    private int monsterSpeed;

    public Monster(String name, int Health, int monsterDamage) {
        this.name = name;
        this.Health = Health;
        this.monsterDamage = monsterDamage;
        this.monsterSpeed = monsterSpeed;
    }

    public int getMonsterSpeed() {
        return monsterSpeed;
    }

    public void setMonsterSpeed(int monsterSpeed) {
        this.monsterSpeed = monsterSpeed;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
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
