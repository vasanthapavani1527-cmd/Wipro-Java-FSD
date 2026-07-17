class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes Sweet.");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes Sour.");
    }
}

public class A {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}