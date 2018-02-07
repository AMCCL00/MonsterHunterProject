package com.company;

import java.util.Scanner;

public class Weapon {
    public Weapon(Dialogue dialogue, Scanner input, String weapon) {
        this.dialogue = dialogue;
        this.input = input;
        this.weapon = weapon;
    }

    Dialogue dialogue = new Dialogue();
    Scanner input = new Scanner(System.in);
    private String weapon;

    public void whichWeapon(){
        dialogue.smith();
        System.out.println("1. Longsword\n2. Switch Axe\n3. Insect Glaive\n4. Charge Blade\n5. Hammer\n6. Duel Blades\n7. Bow\n8. Light Bowgun\n9. Heavy Bowgun\n10. Sword and Shield\n11. Lance\n12. Gunlance\n13. Hunting Horn");
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
                default:
                    input.nextLine();
                    System.out.println("Please pick a weapon Hunter...");
                    whichWeapon();
            }
        }catch(Exception e){

        }
    }
}
