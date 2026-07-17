class InvalidCountryException extends Exception {

    InvalidCountryException(String msg) {
        super(msg);
    }
}

public class G {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India"))
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        G obj = new G();

        try {

            obj.registerUser("Mickey", "US");

            // obj.registerUser("Mini","India");

        } catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        }
    }
}
