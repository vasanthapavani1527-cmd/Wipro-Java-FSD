import java.util.*;

class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // Add Country and Capital
    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    // Get Capital using Country
    public String getCapital(String country) {
        return M1.get(country);
    }

    // Get Country using Capital
    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equals(capital))
                return e.getKey();
        }
        return null;
    }

    // Create M2 (Capital -> Country)
    public HashMap<String, String> createReverseMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    // Create ArrayList of Countries
    public ArrayList<String> getCountryList() {

        return new ArrayList<>(M1.keySet());

    }
}

public class A {

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Reverse Map");

        System.out.println(obj.createReverseMap());

        System.out.println();

        System.out.println("Country List");

        System.out.println(obj.getCountryList());

    }
}