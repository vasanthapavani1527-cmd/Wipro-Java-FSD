import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class C {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("India");
        set.add("Japan");
        set.add("USA");
        set.add("Australia");

        System.out.println("Original TreeSet:");
        System.out.println(set);

        System.out.println("\nReverse Order:");
        TreeSet<String> reverse =
                new TreeSet<>(Collections.reverseOrder());

        reverse.addAll(set);

        System.out.println(reverse);

        System.out.println("\nUsing Iterator:");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

        System.out.println("\nContains India : "
                + set.contains("India"));

        System.out.println("Contains China : "
                + set.contains("China"));
    }
}