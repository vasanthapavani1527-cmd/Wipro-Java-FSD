package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "TS09CD5678";
    }

    public String getOwnerName() {
        return "Jyothi";
    }

    public int getSpeed() {
        return 80;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}