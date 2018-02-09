package com.company;

import java.util.Scanner;

public class Combat {
    Dialogue dialogue = new Dialogue();
    Scanner input = new Scanner(System.in);
    private String weapon;
    private String name;
    private int health;
    private int playerDamage;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    Weapon Wep = new Weapon(dialogue,input,name,health,weapon, playerDamage);
    Hunter hunter = new Hunter(dialogue,input,name,health,weapon);
    GameMenu menu = new GameMenu(dialogue,input,name,health,weapon);
    int monsterDamage;


    public void player(){
            setHealth = health - monsterDamage;
    }
    public void monster(){

    }
}
