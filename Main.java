package com.company;

import java.util.*;

public class Main {
    void mainMenu() {

        mobilePhone mp = new mobilePhone();
        //the option to choose which type of phone to use should not be looped
        //should only be executed once in th program

        Scanner txt = new Scanner(System.in);
        System.out.println("""
                        which phone will you wish to use:
                         1. Mobile Phone
                         2. Landline Phone""");
        int phoneMode = txt.nextInt();

        switch (phoneMode) {
            case 1 -> System.out.println("Your are now using a Mobile Phone");

            //this block of code should not be here
            //case 3:mp.power();
            case 2 -> {
                System.out.println("Your are now using the Landline");
                LandLine landline = new LandLine("+254722000000");
                landline.powerOn();
            }
            default -> System.out.println("Option not Applicable!!!");
        }


        if (phoneMode ==1){
            do {
                System.out.println("""
                            What do you wish to do with the Mobile Phone
                             1. Dialing Pad
                             2. Call
                             3. Messages
                             4. Power
                             5. Play games
                                Enter Choice:""");

                int entry = txt.nextInt();
                switch (entry) {
                    case 1 -> mp.dialing();
                    case 2 -> mp.calling();
                    case 3 -> {
                        System.out.println("The Messaging App");
                        mp.message();
                    }
                    case 4 -> {
                        mp.power();
                        //System.out.println("GENERAL");
                    }
                    default -> System.out.println("Option not Applicable");
                }

            }while(mp.isPowerOn);

        }else if (phoneMode == 2){
            do {
                System.out.println("""
                                        what do you wish to do with the landline phone
                                         1. Letter
                                         2. Call
                                         3. Power
                                         Enter Choice:""");

                int enter = txt.nextInt();
                switch (enter) {
                    case 1 -> mp.calling();
                    case 2 -> {
                        System.out.println("The Messaging App");
                        mp.message();
                    }
                    case 3 -> System.out.println("Not yet  installed");
                    default -> System.out.println("Option not Applicable");
                }


            }while(mp.isPowerOn);
        }else {
            System.out.println("Option not applicable!!!");
        }

    }

    public static void main(String[] args) {

        mobilePhone mp = new mobilePhone();

        // there should be an option to choose which type of phone to use 1st
        Main menu = new Main();
        menu.mainMenu();

        if (mp.power()) {

            if(mp.isPowerOn){
                Main m=new Main();
                m.mainMenu();
            }

        } else {
            System.out.println("The Mobile Subscriber Cannot be Reached!!!");
        }

    }

}







