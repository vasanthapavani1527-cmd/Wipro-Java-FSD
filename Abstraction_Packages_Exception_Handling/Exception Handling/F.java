import java.util.Scanner;

class NegativeMarksException extends Exception {
    NegativeMarksException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    OutOfRangeException(String msg) {
        super(msg);
    }
}

public class F {

    static int getMarks(Scanner sc)
            throws NegativeMarksException, OutOfRangeException {

        int mark = Integer.parseInt(sc.nextLine());

        if (mark < 0)
            throw new NegativeMarksException("Marks cannot be negative.");

        if (mark > 100)
            throw new OutOfRangeException("Marks should be between 0 and 100.");

        return mark;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter 3 Marks:");

                for (int j = 1; j <= 3; j++) {
                    total += getMarks(sc);
                }

                System.out.println("Average Marks of " + name + " = " + (total / 3.0));
                System.out.println();
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (NegativeMarksException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
