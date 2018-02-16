package com.company;

import java.util.Scanner;

public class Combat {
    private final Monster monster;
    Dialogue dialogue = new Dialogue();
    Hunter hunter = new Hunter();
    Scanner input = new Scanner(System.in);
    WeaponType weaponType = new WeaponType();
    private int dodgeChance;
    private int hit;
    private int mount;
    private int mountGuess;
    private int potionUses;
    private boolean monsterAlive = true;
    private boolean Standing = true;
    private boolean damage = true;

    public void dodge(){
        input.nextLine();
        hit = (int) (Math.ceil(Math.random()) * 10);
        dodgeChance = input.nextInt();
        if (dodgeChance == hit + weaponType.getDodgeChance() || dodgeChance == hit || dodgeChance == hit - weaponType.getDodgeChance()) {
            damage = false;
        }
        else{
            damage = true;
        }
    }

    public Combat(Monster monster) {
        this.monster = monster;
    }

    public void mounting() {
        mount = (int) Math.ceil(Math.random() * 5);
        mountGuess = input.nextInt();
        if (mountGuess == mount) {
            //deal 750 damage to the monster and knock it down for 2 rounds
            monster.setHealth(monster.getHealth() - 750);
            //use a boolean to determine how long it is knocked down for and use a increment to track the numnber of rounds
        }
    }

    public void characterBattle(Weapon aWeapon) {
        System.out.println("Would you like to :\n" +
                "1. Attack\n" +
                "2. Heal\n" +
                "3. Attempt to mount it\n" +
                "4. Run back to camp");
        while (monsterAlive = true) {
            GameMenu menu = new GameMenu(monster);
            try {
                if (hunter.getHealth() <= 0) {
                    System.out.println("You were defeated!");
                    System.exit(12321);
                } else if (monster.getHealth() <= 0) {
                    System.out.println("You have Defeated the monster! What would you like to do next?\n" +
                            "1. Return to the menu\n" +
                            "2. Hunt another monster\n" +
                            "3. Exit the game");
                    switch (input.nextInt()) {
                        case 1:
                            //Menu
                            menu.Menu(aWeapon);
                            break;
                        case 2:
                            //Hunt
                            menu.Hunt(aWeapon);
                            break;
                        case 3:
                            //Exit
                            System.exit(12321);
                            break;
                        default:
                            input.nextLine();
                            System.out.println("Please enter 1 2 or 3");
                            characterBattle(aWeapon);
                    }

                }
            } catch (Exception e) {

            }
            try {
                    switch (input.nextInt()) {
                        case 1:
                            //attack
                            monster.setHealth(monster.getHealth() - weaponType.getDamage());
                            if(Standing){
                                if(damage){
                                    hunter.setHealth(hunter.getHealth() - monster.getMonsterDamage());
                                }
                                else{
                                    damage = true;
                                }
                            }
                            break;
                        case 2:
                            //potion
                            if (potionUses < 10) {
                                hunter.setHealth(1000);
                                System.out.println("Your health has been restored to full.");
                                potionUses++;
                                characterBattle(aWeapon);
                            } else {
                                System.out.println("You are out of potions!");
                                characterBattle(aWeapon);
                            }
                            break;
                        case 3:
                            //mount
                            mounting();
                            break;
                        case 4:
                            //run
                            menu.Hunt(aWeapon);
                            break;
                        default:
                            input.nextLine();
                            System.out.println("Attack, Heal, Attempt to mount it or Run.");
                            characterBattle(aWeapon);
                            break;
                    }
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Attack, Heal, Attempt to mount or Run");
                characterBattle(aWeapon);
            }
        }
    }
}