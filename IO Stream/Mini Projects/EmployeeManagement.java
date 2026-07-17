import java.io.*;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    try {
                        FileWriter fw = new FileWriter("employee.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);

                        bw.write(id + "," + name + "," + age + "," + salary);
                        bw.newLine();

                        bw.close();

                        System.out.println("Employee Added Successfully.\n");

                    } catch (IOException e) {
                        System.out.println("Error writing file.");
                    }

                    break;

                case 2:

                    System.out.println("----Report-----");

                    try {
                        File file = new File("employee.txt");

                        if (!file.exists()) {
                            System.out.println("No employee records found.");
                        } else {

                            BufferedReader br = new BufferedReader(new FileReader(file));

                            String line;

                            while ((line = br.readLine()) != null) {

                                String[] data = line.split(",");

                                System.out.println(
                                        data[0] + " "
                                        + data[1] + " "
                                        + data[2] + " "
                                        + data[3]);
                            }

                            br.close();
                        }

                    } catch (IOException e) {
                        System.out.println("Error reading file.");
                    }

                    System.out.println("----End of Report-----");
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        } while (choice != 3);

        sc.close();
    }
}
