package com.company;

public class GameMenu extends Hunter{

    public GameMenu(String name, int health, String weapon) {
        super(name, health, weapon);
    }
    public void Menu(){
        System.out.println("What would you like to do?");
        System.out.println("1. Change your weapon \n2. Go on a Hunt \n3. Exit the Game");
        try{
            switch (input.nextInt()){
                case 1:
                    //Weapon Choice
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
                    Menu();
            }

        }catch(Exception e){

        }
    }

    public void Hunt(){
        System.out.println("Which animal are you going to be hunting today?");
        System.out.println("1. Great Jagras \n2. Tobi Kadatchi \n3. Anjanath \n4. ");
    }
}
