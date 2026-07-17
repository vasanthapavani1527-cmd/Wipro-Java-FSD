import java.util.ArrayList;
import java.util.function.Consumer;

public class F {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Ball");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.add("Fish");
        list.add("Goat");
        list.add("Horse");
        list.add("Ice");
        list.add("Jack");

        Consumer<ArrayList<String>> reverse = l -> {
            for (int i = 0; i < l.size(); i++) {
                String rev = new StringBuilder(l.get(i)).reverse().toString();
                l.set(i, rev);
            }
        };

        reverse.accept(list);

        System.out.println(list);
    }
}