package Abstraction_Packages_Exception_Handling.Packages.com.automobile.ship;

public class Compartment {

    private double height;
    private double width;
    private double breadth;

    public Compartment(double height, double width, double breadth) {

        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void display() {

        System.out.println("Ship Compartment Details");
        System.out.println("Height  : " + height);
        System.out.println("Width   : " + width);
        System.out.println("Breadth : " + breadth);
    }
}