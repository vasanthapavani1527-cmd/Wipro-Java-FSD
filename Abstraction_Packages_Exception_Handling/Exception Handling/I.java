import java.util.Scanner;

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int q = a / b;

            System.out.println("The quotient of " + a + "/" + b + " = " + q);

        } catch (ArithmeticException e) {

            System.out.println("DivideByZeroException caught");

        } finally {

            System.out.println("Inside finally block");

        }
    }
}
