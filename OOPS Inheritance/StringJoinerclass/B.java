import java.util.StringJoiner;

public class B {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Hyderabad");
        s1.add("Mumbai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Kolkata");
        s2.add("Pune");

        StringJoiner result1 = new StringJoiner("-");
        result1.merge(s2);
        result1.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(result1);

        StringJoiner result2 = new StringJoiner("-");
        result2.merge(s1);
        result2.merge(s2);

        System.out.println("s2 merged to s1:");
        System.out.println(result2);
    }
}