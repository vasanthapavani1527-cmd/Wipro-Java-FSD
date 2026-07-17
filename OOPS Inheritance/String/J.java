import java.util.Scanner;

public class J {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        for (int i = 0; i < n; i++)
            System.out.print(last);

        System.out.println();
    }
}