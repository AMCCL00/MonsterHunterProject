package com.company;

import java.util.Scanner;

public class GameMenu extends Combat{

    Scanner input = new Scanner(System.in);
    Combat combat = new Combat();
    Monster monster = new Monster();
    public void Menu(Weapon aWeapon){
        System.out.println("What would you like to do?");
        System.out.println("1. Change your weapon \n2. Go on a Hunt \n3. Exit the Game");
        try{
            switch (input.nextInt()){
                case 1:
                    //Choose Weapon
                    aWeapon.whichWeapon(aWeapon);
                    break;
                case 2:
                    //Start Game
                    Dialogue dialogue = new Dialogue();
                    dialogue.hunt();
                    Hunt(aWeapon);
                    break;
                case 3:
                    //exit
                    System.exit(123);
                default:
                    input.nextLine();
                    System.out.println("Quit joking around Hunter, we need your help!");
                    Menu(aWeapon);
            }

        }catch(Exception e){

        }
    }

    public void Hunt(Weapon aWeapon){
        System.out.println("Which Monster are you going to be hunting today?");
        System.out.println("" +
                "1. Great Jagras \n" +
                "2. Tobi-Kadachi \n" +
                "3. Anjanath \n" +
                "4. Rathilos \n" +
                "5. Great Girros \n" +
                "6. Diablos \n" +
                "7. Nergigante\n" +
                "8. Kirin\n" +
                "9. Teostra\n" +
                "10. Return to Menu\n" +
                "11. Be a coward and run");
        try{
            switch (input.nextInt()){
                case 1:
                    //Great Jagras
                    monster.setHealth(5200);
                    monster.setName("Great Jagras");
                    monster.setMonsterDamage(300);
                    monster.setMonsterSpeed(2);
                    System.out.println("");
                    combat.battle(aWeapon);
                    break;
                case 2:
                    //Tobi-Kadachi
                    monster.setHealth(7000);
                    monster.setName("Tobi-Kadachi");
                    monster.setMonsterDamage(350);
                    monster.setMonsterSpeed(5);
                    combat.battle(aWeapon);
                    break;
                case 3:
                    //Anjanath
                    monster.setHealth(7750);
                    monster.setName("Anjanath");
                    monster.setMonsterDamage(400);
                    monster.setMonsterSpeed(4);
                    combat.battle(aWeapon);
                    break;
                case 4:
                    //Great Girros
                    monster.setHealth(8250);
                    monster.setName("Great Girros");
                    monster.setMonsterDamage(450);
                    monster.setMonsterSpeed(2);
                    combat.battle(aWeapon);
                    break;
                case 5:
                    //Rathilos
                    monster.setHealth(9000);
                    monster.setName("Rathilos");
                    monster.setMonsterDamage(500);
                    monster.setMonsterSpeed(3);
                    combat.battle(aWeapon);
                    break;
                case 6:
                    //Diablos
                    monster.setHealth(9500);
                    monster.setName("Diablos");
                    monster.setMonsterDamage(550);
                    monster.setMonsterSpeed(3);
                    combat.battle(aWeapon);
                    break;
                case 7:
                    //Nergigante
                    monster.setHealth(10275);
                    monster.setName("Nergigante");
                    monster.setMonsterDamage(600);
                    monster.setMonsterSpeed(2);
                    combat.battle(aWeapon);
                    break;
                case 8:
                    //Kirin
                    monster.setHealth(12500);
                    monster.setName("Kirin");
                    monster.setMonsterDamage(650);
                    monster.setMonsterSpeed(4);
                    combat.battle(aWeapon);
                    break;
                case 9:
                    //Teostra
                    monster.setHealth(17500);
                    monster.setName("Teostra");
                    monster.setMonsterDamage(700);
                    monster.setMonsterSpeed(3);
                    combat.battle(aWeapon);
                    break;
                case 10:
                    //return to menu
                    Menu(aWeapon);
                    break;
                case 11:
                    //Run
                    System.exit(123);
                default:
                    input.nextLine();
                    System.out.println("Hunter, please choose one of the listed monsters or leave.");
                    Hunt(aWeapon);
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Hunter, please choose one of the listed monsters or leave.");
            Hunt(aWeapon);
        }
    }
}
