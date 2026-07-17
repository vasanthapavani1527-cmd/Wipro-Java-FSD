import java.util.*;

public class B {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Siva");
        map.put("102", "Vinay");
        map.put("103", "Rahul");

        System.out.println("Key 102 exists : "
                + map.containsKey("102"));

        System.out.println("Value Rahul exists : "
                + map.containsValue("Rahul"));

        System.out.println();

        Iterator<Map.Entry<String, String>> it
                = map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, String> e = it.next();

            System.out.println(e.getKey()
                    + " -> " + e.getValue());

        }

    }
}