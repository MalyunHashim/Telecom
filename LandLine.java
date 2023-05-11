package com.company;

public class LandLine extends Main {

    private String myNumber;
    private boolean isRinging;

    public LandLine(String myNumber){
        this.myNumber = myNumber;
    }


    public void powerOn() {
        System.out.println("Landline is Online!");
        System.out.println("And ready to roll");
    }


    public void dial(String phoneNumber) {
        System.out.println("Now Ringing "+ phoneNumber +" on Landline");
    }


    public void answer() {
        if (isRinging){
            System.out.println("Answer the landline");
            isRinging = false;
        }else {
            System.out.println("phone is not ringing");
        }
    }


    public boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber)){
            isRinging = true;
            System.out.println("Phone is Ringing");
        }else{
            isRinging = false;
        }
        return isRinging;
    }


    public boolean isRinging() {
        return isRinging;
    }


    public boolean dialing() {
        return false;
    }


    public void calling() {

    }


    public boolean answering() {
        return false;
    }


    public boolean declining() {
        return false;
    }


    public boolean power() {
        return false;
    }
}
