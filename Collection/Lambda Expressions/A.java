import java.util.ArrayList;

public class A {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(5);
        al.add(8);
        al.add(11);
        al.add(15);
        al.add(17);
        al.add(20);
        al.add(23);
        al.add(25);
        al.add(29);
        al.add(31);
        al.add(34);
        al.add(37);
        al.add(40);
        al.add(43);
        al.add(47);
        al.add(50);
        al.add(53);
        al.add(56);
        al.add(59);
        al.add(61);
        al.add(64);
        al.add(67);
        al.add(70);
        al.add(73);

        al.forEach(n -> {
            boolean prime = true;

            if (n <= 1)
                prime = false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.print(n + " ");
        });
    }
}
