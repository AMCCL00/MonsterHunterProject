package com.company;

import java.util.Scanner;

public class GameMenu extends Combat{

    Scanner input = new Scanner(System.in);
    private Monster monster;
    Combat combat = new Combat();
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
                    System.exit(12321);
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
                    Monster greatJagras = new Monster("Great Jagras", 5200, 300);
                    combat.characterBattle(aWeapon, greatJagras);
                    break;
                case 2:
                    //Tobi-Kadachi
                    Monster tobiKadachi = new Monster("Tobi-Kadachi", 7000,350);
                    combat.characterBattle(aWeapon, tobiKadachi);
                    break;
                case 3:
                    //Anjanath
                    Monster anjanath = new Monster("Anjanath", 7750, 400);
                    combat.characterBattle(aWeapon, anjanath);
                    break;
                case 4:
                    //Great Girros
                    Monster greatGirros = new Monster("Great Girros", 8250, 450);
                    combat.characterBattle(aWeapon, greatGirros);
                    break;
                case 5:
                    //Rathilos
                    Monster rathilos = new Monster("Rathilos", 9000, 500);
                    combat.characterBattle(aWeapon, rathilos);
                    break;
                case 6:
                    //Diablos
                    Monster diablos = new Monster("Diablos", 9500, 550);
                    combat.characterBattle(aWeapon, diablos);
                    break;
                case 7:
                    //Nergigante
                    Monster nergigante = new Monster("Nergigante", 10275,600);
                    combat.characterBattle(aWeapon, nergigante);
                    break;
                case 8:
                    //Kirin
                    Monster kirin = new Monster("Kirin", 12500, 650);
                    combat.characterBattle(aWeapon, kirin);
                    break;
                case 9:
                    //Teostra
                    Monster teostra = new Monster("Teostra", 17500, 700);
                    combat.characterBattle(aWeapon, teostra);
                    break;
                case 10:
                    //return to menu
                    Menu(aWeapon);
                    break;
                case 11:
                    //Run
                    System.exit(12321);
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
