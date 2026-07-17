import java.util.Arrays;

public class F {
    public static void main(String[] args) {

        int[] arr = {50, 10, 40, 20, 30};

        Arrays.sort(arr);

        for (int i : arr)
            System.out.print(i + " ");
    }
}
