import java.util.*;

public class D {

    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Siva", 987654321);
        contactList.put("Vinay", 912345678);
        contactList.put("Rahul", 998877665);

        // Check Key
        System.out.println("Key 'Siva' exists : "
                + contactList.containsKey("Siva"));

        // Check Value
        System.out.println("Phone Number 912345678 exists : "
                + contactList.containsValue(912345678));

        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it =
                contactList.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> e = it.next();

            System.out.println(e.getKey()
                    + " -> "
                    + e.getValue());

        }
    }
}
