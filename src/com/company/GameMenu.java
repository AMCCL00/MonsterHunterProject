package com.company;

import java.util.Scanner;

public class GameMenu{
    Scanner input = new Scanner(System.in);
    public GameMenu(Dialogue dialogue, Scanner input, String name, int health, String weapon) {
        Weapon aWeapon = new Weapon(dialogue,input, name,health,weapon);
    }

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

    public void Hunt(){
        System.out.println("Which Monster are you going to be hunting today?");
        System.out.println("1. Great Jagras \n2. Tobi Kadatchi \n3. Anjanath \n4. Rathilos \n5. Great Girros \n6. Nergigante \n7. Kirin");
    }
}
