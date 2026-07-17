public class M {
    public static void main(String[] args) {

        for (int num = 10; num <= 99; num++) {
            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.println(num);
        }
    }
}
