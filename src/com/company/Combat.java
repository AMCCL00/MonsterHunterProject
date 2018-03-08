package com.company;

import java.util.Scanner;

public class Combat {
    Dialogue dialogue = new Dialogue();
    Hunter hunter = new Hunter();
    Scanner input = new Scanner(System.in);
    WeaponType weaponType = new WeaponType("Unarmed", 1, 0);
    private int dodgeChance;
    private int hit;
    private int mount;
    private int mountGuess;
    private int potionUses;
    private int grounded;
    private boolean monsterAlive = true;
    private boolean Standing = true;
    private boolean damage = true;

    public void dodge(){
        input.nextLine();
        System.out.println("Pick a number between 1 and 10 for your dodge chance.");
        hit = (int) (Math.ceil(Math.random()) * 10);
        dodgeChance = input.nextInt();
        if (hit >= dodgeChance + weaponType.getDodgeChance() || dodgeChance == hit || hit <= dodgeChance - weaponType.getDodgeChance()) {
            damage = false;
        }
        else{
            damage = true;
        }
    }

    public void mounting(Monster monster) {
        mount = (int) Math.ceil(Math.random() * 5);
        mountGuess = input.nextInt();
        if (mountGuess == mount) {
            System.out.println("You successfully mounted the monster and knocked it on the ground for 2 rounds.");
            //deal 750 damage to the monster and knock it down for 2 rounds
            monster.setHealth(monster.getHealth() - 750);
            Standing = false;
            //use a boolean to determine how long it is knocked down for and use a increment to track the number of rounds in the attacking
            //case
        }
    }

    public void characterBattle(Weapon aWeapon, Monster monster) {
        System.out.println("Would you like to :\n" +
                "1. Attack\n" +
                "2. Heal\n" +
                "3. Attempt to mount it\n" +
                "4. Run back to camp");
        while (monsterAlive = true) {
            GameMenu menu = new GameMenu();
                if (hunter.getHealth() <= 0) {
                    System.out.println("You were defeated!");
                    System.exit(12321);
                } else if (monster.getHealth() <= 0) {
                    System.out.println("You have Defeated the monster! What would you like to do next?\n" +
                            "1. Return to the menu\n" +
                            "2. Hunt another monster\n" +
                            "3. Exit the game");
                    switch (input.nextLine()) {
                        case "1":
                            //Menu
                            menu.Menu(aWeapon);
                            break;
                        case "2":
                            //Hunt
                            menu.Hunt(aWeapon);
                            break;
                        case "3":
                            //Exit
                            System.exit(12321);
                            break;
                        default:
                            input.nextLine();
                            System.out.println("Please enter 1 2 or 3.");
                            characterBattle(aWeapon, monster);
                    }
                }
                    else {
                    switch (input.nextLine()) {
                        case "1":
                            //attack
                            System.out.println("You attack the monster.");
                            monster.setHealth(monster.getHealth() - weaponType.getDamage());
                            System.out.println("The monster has " + monster.getHealth() + " health left.");
                            if (Standing) {
                                dodge();
                                if (damage) {
                                    hunter.setHealth(hunter.getHealth() - monster.getMonsterDamage());
                                    System.out.println("The monster hits you! You have " + hunter.getHealth() + " health left.");
                                } else {
                                    System.out.println("The monster misses! You have " + hunter.getHealth() + " health left.");
                                    damage = true;
                                }
                            }
                            if (Standing = false){
                                grounded++;
                                System.out.println("The monster is knocked down and can't attack for + " + (3 - grounded) + " more rounds.");
                                if(grounded == 2){
                                }
                            }
                            characterBattle(aWeapon, monster);
                            break;
                        case "2":
                            //potion
                            if (potionUses < 10) {
                                hunter.setHealth(1000);
                                System.out.println("Your health has been restored to full.");
                                potionUses++;
                                characterBattle(aWeapon, monster);
                            } else {
                                System.out.println("You are out of potions!");
                                characterBattle(aWeapon, monster);
                            }
                            break;
                        case "3":
                            //mount
                            mounting(monster);
                            break;
                        case "4":
                            //run
                            menu.Hunt(aWeapon);
                            break;
                        default:
                            input.nextLine();
                            System.out.println("Attack, Heal, Attempt to mount it or Run.");
                            characterBattle(aWeapon, monster);
                            break;
                    }

                }
        }
    }
}