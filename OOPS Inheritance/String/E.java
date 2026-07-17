import java.util.Scanner;

public class E {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println(str.substring(1,str.length()-1));
    }
}
