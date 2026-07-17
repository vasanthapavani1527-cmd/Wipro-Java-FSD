interface PrimeCheck {
    Check create(int n);
}

class Check {

    Check(int n) {

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class C {

    public static void main(String[] args) {

        PrimeCheck p = Check::new;

        p.create(17);
    }
}
