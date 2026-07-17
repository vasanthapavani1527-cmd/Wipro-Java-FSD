import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        try {
            int num = Integer.parseInt(sc.nextLine());

            System.out.println("The square value is " + (num * num));
            System.out.println("The work has been done successfully");
        }
        catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
