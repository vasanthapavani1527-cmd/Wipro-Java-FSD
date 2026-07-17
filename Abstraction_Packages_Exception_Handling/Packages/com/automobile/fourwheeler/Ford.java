package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "TS10MN2222";
    }

    public String getOwnerName() {
        return "Naveen";
    }

    public int speed() {
        return 140;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}