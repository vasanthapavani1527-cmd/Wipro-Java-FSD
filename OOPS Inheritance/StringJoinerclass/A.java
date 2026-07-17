import java.util.ArrayList;
import java.util.StringJoiner;

public class A {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anil");
        names.add("Bhavya");
        names.add("Charan");
        names.add("Deepika");
        names.add("Eswar");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
