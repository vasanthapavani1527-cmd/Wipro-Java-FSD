interface DigitCount {
    int count(int n);
}

class Demo {

    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}

public class B {

    public static void main(String[] args) {

        DigitCount d = Demo::digitCount;

        System.out.println("Number of Digits = " + d.count(12345));
    }
}