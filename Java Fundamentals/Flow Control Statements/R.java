public class R {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (num == reverse)
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }
}
