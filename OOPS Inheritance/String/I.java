import java.util.Scanner;

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String a = sc.nextLine();

        System.out.print("Enter Second String: ");
        String b = sc.nextLine();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        if (a.length() > min)
            result += a.substring(min);

        if (b.length() > min)
            result += b.substring(min);

        System.out.println(result);
    }
}
