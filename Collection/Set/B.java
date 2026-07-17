import java.util.HashSet;
import java.util.Iterator;

public class B {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Siva");
        employees.add("Vinay");
        employees.add("Rahul");
        employees.add("Anitha");

        System.out.println("Employee Names:");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }
    }
}