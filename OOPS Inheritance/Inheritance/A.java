class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {

    @Override
    void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping.");
    }

    void fly() {
        System.out.println("Bird is flying.");
    }
}

public class A {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("Animal Object");
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();
        System.out.println("Bird Object");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
