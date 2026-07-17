import java.util.ArrayList;
import java.util.function.Predicate;

public class C {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("hello");
        list.add("radar");
        list.add("world");
        list.add("malayalam");
        list.add("apple");
        list.add("noon");
        list.add("book");

        Predicate<String> palindrome = str ->
                str.equals(new StringBuilder(str).reverse().toString());

        list.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}