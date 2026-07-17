import java.util.*;

class CountryHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {

        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {

        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {

            if (e.getValue().equals(capital))

                return e.getKey();

        }

        return null;
    }

    public Hashtable<String, String> createReverseMap() {

        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {

            M2.put(e.getValue(), e.getKey());

        }

        return M2;
    }

    public ArrayList<String> getCountryList() {

        return new ArrayList<>(M1.keySet());

    }
}

public class F {

    public static void main(String[] args) {

        CountryHashTable obj = new CountryHashTable();

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
