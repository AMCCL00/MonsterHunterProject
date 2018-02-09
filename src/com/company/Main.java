package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dialogue dialogue = new Dialogue();
        Scanner input = new Scanner(System.in);
        String name = "";
        String weapon = "";
        int playerDamage = 0;
        int health = 100;
        Weapon Weapon = new Weapon(dialogue, input, name, health, weapon, playerDamage);
        GameMenu menu = new GameMenu(dialogue, input, name, health, weapon);
        dialogue.backStory();
        menu.Menu(Weapon);
    }
}
