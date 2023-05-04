package com.company;
import java.util.*;

public class mobilePhone implements Telephone{

    String myNumber;
    boolean isPowerOn = false;
    boolean numberPresent;

    public mobilePhone(){

    }
    @Override
    public boolean dialing() {
        numberPresent=false;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number to call: ");
        myNumber= sc.nextLine();
        if(myNumber.isEmpty()){
            return numberPresent;
        }else{
            return numberPresent=true;
        }

    }

    @Override
    public void calling() {
        dialing();

        System.out.println("now call the number");
        System.out.println("calling the number "+ myNumber);




    }



    @Override
    public boolean answering() {
        return false;
    }

    @Override
    public boolean declining() {
        return false;
    }

    @Override
    public boolean power() {



            Scanner button = new Scanner(System.in);
            System.out.println("welcome to samsung Mobile..." + " " +
                    "\n Press 1 to turn on phone: " +
                    "\n Press 2 to turn off phone: ");


            int selection = button.nextInt();
            switch (selection) {
                case 1 -> {
                    isPowerOn = true;
                    System.out.println("Turning on");
                }
                case 2 -> {
                    if (!isPowerOn) {
                        System.out.println("Phone is already off");

                    } else {
                        System.out.println("Turning off");
                    }
                }
                default -> {
                    System.out.println("not applicable");

                }
            }

            return isPowerOn;


    }
    void inbox(){
        
        System.out.println(" Hi there " +
                " how are you " +
                " where are you from " +
                " What is your name ");

    }
    void outbox(){
        System.out.println("Hi " +
                " Am fine thank you " +
                " Am from kenya " +
                " My name is Felix ");

    }
    void message() {
        mobilePhone mp = new mobilePhone();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println(
                        " 1. Create a New Message" +
                        "\n 2. Inbox" +
                        "\n 3. Outbox");
        int txt = sc1.nextInt();
        switch (txt) {
            case 1 -> {
                System.out.println("Type your message here: ");
                String Message = sc2.nextLine();

                System.out.println("Enter the recipient: ");
                String Recipient = sc2.nextLine();

                System.out.println("Do you wish to send this  " +
                        "\nMessage: \n" + Message +
                        "\nTo: " + Recipient);
                System.out.println(
                                "1. yes" +
                                "\n2. No" +
                                "\n3. Edit message" +
                                "\n4. Change recipient");
                int option = sc1.nextInt();
                if (option == 1) {
                    System.out.println("sending...");
                } else if (option == 2) {
                    System.out.println("not sent!!!");
                } else if (option == 3) {
                    System.out.println("Edit message: \n" + Message );
                    Message = sc2.nextLine();

                    System.out.println("Edited message: \n" + Message );

                    System.out.println("Do you wish to send this  " +
                            "\nMessage: \n" + Message +
                            "\nTo: " + Recipient);

                } else if (option == 4){
                    System.out.println("Change recipient: \n" + Recipient );
                    Recipient = sc2.nextLine();

                    System.out.println("Change recipient: \n" + Recipient );

                    System.out.println("Do you wish to send this  " +
                            "\nMessage: \n" + Message +
                            "\nTo: " + Recipient);
                }else{
                    System.out.println("Not Applicable ");
                    message();
                }

            }
            case 2 -> mp.inbox();
            case 3 -> mp.outbox();
        }
    }
}
