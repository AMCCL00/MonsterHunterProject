package com.company;

import java.util.Scanner;

public class Weapon extends GameMenu{
    public Weapon(Dialogue dialogue, Scanner input, String name, int health, String weapon, int playerDamage) {
        super(dialogue, input, name, health, weapon);
        this.dialogue = dialogue;
        this.input = input;
        this.weapon = weapon;
        this.playerDamage = playerDamage;
    }
    Dialogue dialogue = new Dialogue();
    private String weapon;
    private int playerDamage;

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void whichWeapon(Weapon aWeapon){
        dialogue.smith();
        System.out.println("1. Longsword \n" +
                "2. Switch Axe \n" +
                "3. Insect Glaive \n" +
                "4. Charge Blade \n" +
                "5. Hammer \n" +
                "6. Duel Blades \n" +
                "7. Bow \n" +
                "8. Light Bowgun \n" +
                "9. Heavy Bowgun \n" +
                "10. Sword and Shield \n" +
                "11. Lance\n12. Gunlance \n" +
                "13. Hunting Horn \n" +
                "14. Great Sword\n" +
                "15. Exit the Smithy");
        try{
            switch(input.nextInt()){
                case 1:
                    //Longsword
                    break;
                case 2:
                    //Switch Axe
                    break;
                case 3:
                    //Insect Glaive
                    break;
                case 4:
                    //Charge Blade
                    break;
                case 5:
                    //Hammer
                    break;
                case 6:
                    //Duel Blade
                    break;
                case 7:
                    //Bow
                    break;
                case 8:
                    //Light Bowgun
                    break;
                case 9:
                    //Heavy Bowgun
                    break;
                case 10:
                    //Sword and Shield
                    break;
                case 11:
                    //Lance
                    break;
                case 12:
                    //Gunlance
                    break;
                case 13:
                    //Hunting Horn
                    break;
                case 14:
                    //Great Sword
                    break;
                case 15:
                    //return to menu
                    Menu(aWeapon);
                default:
                    input.nextLine();
                    System.out.println("Please pick a weapon Hunter...");
                    whichWeapon(aWeapon);
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Please pick a weapon Hunter...");
            whichWeapon(aWeapon);
        }
        Menu(aWeapon);
    }
}
