import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String output = sc.nextLine();

        try {

            FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output);

            int data;

            while ((data = fis.read()) != -1) {

                fos.write(data);

            }

            fis.close();
            fos.close();

            System.out.println("File is copied.");

        } catch (IOException e) {

            System.out.println("Error : " + e.getMessage());

        }

    }
}
