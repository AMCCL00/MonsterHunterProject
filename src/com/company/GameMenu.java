package com.company;

import java.util.Scanner;

public class GameMenu{
    Scanner input = new Scanner(System.in);
    public GameMenu(Dialogue dialogue, Scanner input, String name, int health, String weapon) {
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
                    Dialogue dialogue = new Dialogue();
                    dialogue.hunt();
                    Hunt();
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
        System.out.println("" +
                "1. Great Jagras \n" +
                "2. Tobi-Kadachi \n" +
                "3. Anjanath \n" +
                "4. Rathilos \n" +
                "5. Great Girros \n" +
                "6. Nergigante \n" +
                "7. Kirin\n" +
                "8. Diablos\n" +
                "9. Zorah Magdaros\n" +
                "10. Be a coward and run");
        try{
            switch (input.nextInt()){
                case 1:
                    //Great Jagras
                    break;
                case 2:
                    //Tobi-Kadachi
                    break;
                case 3:
                    //Anjanath
                    break;
                case 4:
                    //Rathilos
                    break;
                case 5:
                    //Great Girros
                    break;
                case 6:
                    //Nergigante
                    break;
                case 7:
                    //Kirin
                    break;
                case 8:
                    //Diablos
                    break;
                case 9:
                    //Zorah Magdaros
                    break;
                case 10:
                    //Run
                    System.exit(123);
                default:
                    input.nextLine();
                    System.out.println("Hunter, please choose one of the listed monsters or leave.");
                    Hunt();
            }
        }catch(Exception e){
            input.nextLine();
            System.out.println("Hunter, please choose one of the listed monsters or leave.");
            Hunt();
        }
    }
}
