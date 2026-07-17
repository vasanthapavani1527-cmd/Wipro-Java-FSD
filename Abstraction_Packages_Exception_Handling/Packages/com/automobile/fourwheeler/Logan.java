package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Renault Logan";
    }

    public String getRegistrationNumber() {
        return "AP01XY1111";
    }

    public String getOwnerName() {
        return "Vinay";
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}