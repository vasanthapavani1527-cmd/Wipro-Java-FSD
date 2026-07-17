import java.util.HashSet;

class CountrySet {

    HashSet<String> H1 = new HashSet<>();

    // Add country
    public HashSet<String> saveCountryNames(String countryName) {

        H1.add(countryName);
        return H1;
    }

    // Search country
    public String getCountry(String countryName) {

        for (String country : H1) {

            if (country.equals(countryName))
                return country;
        }

        return null;
    }
}

public class A {

    public static void main(String[] args) {

        CountrySet obj = new CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("USA");

        System.out.println("Countries : " + obj.H1);

        System.out.println("Search India : " + obj.getCountry("India"));
        System.out.println("Search China : " + obj.getCountry("China"));
    }
}