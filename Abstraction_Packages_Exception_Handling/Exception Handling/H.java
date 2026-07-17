class AgeException extends Exception {

    AgeException(String msg) {
        super(msg);
    }
}

public class H {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Usage: java H <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60)
                throw new AgeException("Age should be >=18 and <60");

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (AgeException e) {

            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("Age should be an integer.");

        }
    }
}
