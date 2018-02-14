package com.company;

public class Dialogue {

    public void instructions(){
        System.out.println("    In this turn based game you will be fighting monsters that will do 1 of 3 attacks, after dropping them by 20% of their health, they will move from area to area and you will be required \n" +
                "to chase them to finish them off. After every 45% of their hp taken down, you will knock them on the ground, giving you a free 3 turns to hit them. After the 3rd turn, the monster will get \n" +
                "up and immediately attack you. After they attack, you will be offered a chance to guess a number between 1 and 10 and if you are within 1 number off it you will successfully dodge the \n" +
                "attack, if not, you will be hit by the attack and each of the monsters' moves have different amounts of damage. You have a total of 10 potions each fight that you can use that will\n" +
                "restore you to full.\n");
    }

    public void smith(){
        System.out.println("Smith: Hello Hunter, Which weapon would you like today?");
    }
    public void backStory(){
        System.out.println("Fleet Commander: Welcome Hunter, Your job here is to rid the area of the monsters that threaten our encampment and to help us hunt down the Elder Dragons on this Island.\n");
    }
    public void hunt(){
        System.out.println("Fleet Commander: Good luck Hunter. You'll need it.");
    }
}
