package com.company;

import java.util.Scanner;
//Andrew McClary
public class Main {

    private static Monster monster;

    public static void main(String[] args) {
        Dialogue dialogue = new Dialogue();
        Scanner input = new Scanner(System.in);
        Weapon Weapon = new Weapon();
        GameMenu menu = new GameMenu();
        Hunter hunter = new Hunter();
        dialogue.instructions();
        dialogue.backStory();
        hunter.setName();
        menu.Menu(Weapon);
    }
}
