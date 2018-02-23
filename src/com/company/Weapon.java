package com.company;

public class Weapon extends GameMenu{
    WeaponType weaponType = new WeaponType("", 0, 0);
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
                    WeaponType longsword = new WeaponType("Longsword", 150, 4);
                    System.out.println("Smith: Ahh the Long Sword, Great choice Hunter.");
                    break;
                case 2:
                    //Switch Axe
                    WeaponType switchAxe = new WeaponType("Switch Axe", 200, 1);
                    System.out.println("Smith: The Switch Axe, I like your taste Hunter. ");
                    break;
                case 3:
                    //Insect Glaive
                    WeaponType insectGlaive = new WeaponType("Insect Glaive", 125, 4);
                    System.out.println("Smith: The Insect Glaive, Fast and Mobile.");
                    break;
                case 4:
                    //Charge Blade
                    WeaponType chargeBlade = new WeaponType("Charge Blade", 170, 3);
                    System.out.println("Smith: A shield and a big sword in one!");
                    break;
                case 5:
                    //Hammer
                    WeaponType Hammer = new WeaponType("Hammer", 225, 1);
                    System.out.println("Smith: Slow but powerful weapon, good choice hunter!");
                    break;
                case 6:
                    //Dual Blade
                    WeaponType dualBlade = new WeaponType("Dual Blade", 150, 5);
                    System.out.println("Smith: Duel blades are very fast light attacks with great mobility, I like your style Hunter.");
                    break;
                case 7:
                    //Bow
                    WeaponType Bow = new WeaponType("Bow", 125, 3);
                    System.out.println("Smith: A Bow, Fast and powerful ranged attacks with this one Hunter.");
                    break;
                case 8:
                    //Light Bowgun
                    WeaponType lightBowgun = new WeaponType("Light Bowgun", 50, 4);
                    System.out.println("Smith: The Light Bowgun, Very fast light attacks.");
                    break;
                case 9:
                    //Heavy Bowgun
                    WeaponType heavyBowgun = new WeaponType("Heavy Bowgun", 175, 3);
                    System.out.println("Smith: Slow powerful attacks from a range.");
                    break;
                case 10:
                    //Sword and Shield
                    WeaponType swordAndShield = new WeaponType("Sword and Shield", 100, 5);
                    System.out.println("Smith: A classic Sword and shield, average damage and speed but good defense.");
                    break;
                case 11:
                    //Lance
                    WeaponType lance = new WeaponType("Lance", 150, 3);
                    System.out.println("Smith: The lance is a slow but powerful lung attacking weapon with decent mobility, interesting choice, but I like it Hunter.");
                    break;
                case 12:
                    //Gunlance
                    WeaponType gunlance = new WeaponType("Gunlance", 160, 2);
                    System.out.println("Smith: The gun lance uses lunge attacks and the gun at the end of the hilt to do powerful attacks to the monster.");
                    break;
                case 13:
                    //Hunting Horn
                    WeaponType huntingHorn = new WeaponType("Hunting Horn", 140, 4);
                    System.out.println("Smith: Ahh the hunting horn, average damage, speed and mobility but it can buff you and other members of your Hunting party so theres that.");
                    break;
                case 14:
                    WeaponType greatSword = new WeaponType("Great Sword", 225, 5);
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
