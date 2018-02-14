package com.company;

import java.util.Scanner;

public class Combat{
    Dialogue dialogue = new Dialogue();
    Hunter hunter = new Hunter();
    Scanner input = new Scanner(System.in);
    Monster monster = new Monster();
    WeaponType weaponType = new WeaponType();
    private int dodgeChance;
    private int hit;
    private int mount;
    private int mountGuess;
    private int potionUses;

    public void player(){
        hunter.setHealth(1000);
        hunter.setPlayerDamage(weaponType.getDamage());
    }
    public void fights(){
        input.nextLine();
        hit = (int) (Math.ceil(Math.random())*10);
        dodgeChance = input.nextInt();
        if (dodgeChance == hit + weaponType.getDodgeChance() || dodgeChance == hit || dodgeChance == hit - weaponType.getDodgeChance()){

        }
    }
    public void mounting(){
        mount = (int) Math.ceil(Math.random()*5);
        mountGuess = input.nextInt();
        if (mountGuess == mount){
            //deal 750 damage to the monster and knock it down for 2 rounds
            //use a boolean to determine how long it is knocked down for and use a increment to track the numnber of rounds
        }
    }
    public void battle(Weapon aWeapon){
        System.out.println("Would you like to :\n" +
                "1. Attack\n" +
                "2. Heal\n" +
                "3. Attempt to mount it\n" +
                "4. Run back to camp");
        try{
            switch(input.nextInt()){
                case 1:
                    //attack
                    break;
                case 2:
                    //potion
                    hunter.setHealth(1000);
                    System.out.println("Your health has been restored to full.");
                    potionUses ++;
                    battle(aWeapon);
                    break;
                case 3:
                    //mount
                    mounting();
                    break;
                case 4:
                    //run
                    GameMenu menu = new GameMenu();
                    menu.Hunt(aWeapon);
                    break;
                default:
                    input.nextLine();
                    System.out.println("Attack, Heal, Attempt to mount it or Run.");
                    battle(aWeapon);
                    break;
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Attack, Heal, Attempt to mount or Run");
            battle(aWeapon);
        }
    }
}
