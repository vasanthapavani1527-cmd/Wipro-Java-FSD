import java.util.TreeSet;

class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {

        for (String country : T1) {

            if (country.equals(countryName))
                return country;

        }

        return null;
    }
}

public class D {

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Australia");

        System.out.println("Countries : " + obj.T1);

        System.out.println("Search Japan : "
                + obj.getCountry("Japan"));

        System.out.println("Search China : "
                + obj.getCountry("China"));
    }
}
