interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class A implements Vehicle, FourWheeler {

    @Override
    public void message() {
        Vehicle.super.message();
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.message();
    }
}