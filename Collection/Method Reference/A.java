interface Factorial {
    int find(int n);
}

class Demo {

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

public class A {

    public static void main(String[] args) {

        Demo obj = new Demo();

        Factorial f = obj::factorial;

        System.out.println("Factorial = " + f.find(5));
    }
}
