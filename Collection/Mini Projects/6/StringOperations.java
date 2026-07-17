import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder result1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                result1.append(s2);
            else
                result1.append(s1.charAt(i));
        }
        list.add(result1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String reverse = new StringBuilder(s2).reverse().toString();
            String result2 = s1.substring(0, last) + reverse
                    + s1.substring(last + s2.length());
            list.add(result2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        if (first != -1 && first != last) {
            String result3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());
            list.add(result3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int mid = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // Operation 5
        String result5 = s1;

        for (int i = 0; i < s2.length(); i++) {
            result5 = result5.replace(s2.charAt(i), '*');
        }

        list.add(result5);

        return list;
    }

    public static void main(String[] args) {

        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("Output:");
        for (String s : output) {
            System.out.println(s);
        }
    }
}
