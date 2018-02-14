package com.company;

public class Weapon extends GameMenu{
    WeaponType weaponType = new WeaponType();
    Dialogue dialogue = new Dialogue();
    private int playerDamage;

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
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
                    weaponType.setDamage(150);
                    weaponType.setSpeed(6);
                    weaponType.setWeaponType("Longsword");
                    weaponType.setDodgeChance(4);
                    System.out.println("Smith: Ahh the Long Sword, Great choice Hunter.");
                    break;
                case 2:
                    //Switch Axe
                    weaponType.setDamage(200);
                    weaponType.setSpeed(4);
                    weaponType.setWeaponType("Switch Axe");
                    weaponType.setDodgeChance(1);
                    System.out.println("Smith: The Switch Axe, I like your taste Hunter. ");
                    break;
                case 3:
                    //Insect Glaive
                    weaponType.setDamage(75);
                    weaponType.setSpeed(7);
                    weaponType.setWeaponType("Insect Glaive");
                    weaponType.setDodgeChance(3);
                    System.out.println("Smith: The Insect Glaive, Fast and Mobile.");
                    break;
                case 4:
                    //Charge Blade
                    weaponType.setDamage(100);
                    weaponType.setSpeed(6);
                    weaponType.setWeaponType("Charge Blade");
                    weaponType.setDodgeChance(3);
                    System.out.println("Smith: A shield and a big sword in one!");
                    break;
                case 5:
                    //Hammer
                    weaponType.setDamage(225);
                    weaponType.setSpeed(3);
                    weaponType.setWeaponType("Hammer");
                    weaponType.setDodgeChance(2);
                    System.out.println("Smith: Slow but powerful weapon, good choice hunter!");
                    break;
                case 6:
                    //Dual Blade
                    weaponType.setDamage(50);
                    weaponType.setSpeed(8);
                    weaponType.setWeaponType("Dual Blade");
                    weaponType.setDodgeChance(5);
                    System.out.println("Smith: Duel blades are very fast light attacks with great mobility, I like your style Hunter.");
                    break;
                case 7:
                    //Bow
                    weaponType.setDamage(125);
                    weaponType.setSpeed(4);
                    weaponType.setWeaponType("Bow");
                    weaponType.setDodgeChance(3);
                    System.out.println("Smith: A Bow, Fast and powerful ranged attacks with this one Hunter.");
                    break;
                case 8:
                    //Light Bowgun
                    weaponType.setDamage(50);
                    weaponType.setSpeed(7);
                    weaponType.setWeaponType("Light Bowgun");
                    weaponType.setDodgeChance(4);
                    System.out.println("Smith: The Light Bowgun, Very fast light attacks.");
                    break;
                case 9:
                    //Heavy Bowgun
                    weaponType.setDamage(175);
                    weaponType.setSpeed(4);
                    weaponType.setWeaponType("Heavy Bowgun");
                    weaponType.setDodgeChance(3);
                    System.out.println("Smith: Slow powerful attacks from a range.");
                    break;
                case 10:
                    //Sword and Shield
                    weaponType.setDamage(100);
                    weaponType.setSpeed(5);
                    weaponType.setWeaponType("Sword and Shield");
                    weaponType.setDodgeChance(5);
                    System.out.println("Smith: A classic Sword and shield, average damage and speed but good defense.");
                    break;
                case 11:
                    //Lance
                    weaponType.setDamage(150);
                    weaponType.setSpeed(3);
                    weaponType.setWeaponType("Lance");
                    weaponType.setDodgeChance(3);
                    System.out.println("Smith: The lance is a slow but powerful lung attacking weapon with decent mobility, interesting choice, but I like it Hunter.");
                    break;
                case 12:
                    //Gunlance
                    weaponType.setDamage(160);
                    weaponType.setSpeed(3);
                    weaponType.setWeaponType("Gunlance");
                    weaponType.setDodgeChance(2);
                    System.out.println("Smith: The gun lance uses lung attacks and the gun at the end of the hilt to do powerful attacks to the monster.");
                    break;
                case 13:
                    //Hunting Horn
                    weaponType.setDamage(130);
                    weaponType.setSpeed(5);
                    weaponType.setWeaponType("Hunting Horn");
                    weaponType.setDodgeChance(4);
                    System.out.println("Smith: Ahh the hunting horn, average damage, speed and mobility but it can buff you and other members of your Hunting party so theres that.");
                    break;
                case 14:
                    //Great Sword
                    weaponType.setDamage(225);
                    weaponType.setSpeed(4);
                    weaponType.setWeaponType("Great Sword");
                    weaponType.setDodgeChance(1);
                    System.out.println("Smith: The classic Greatsword, Very powerful but slow attacks, none the less a great weapon!");
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
