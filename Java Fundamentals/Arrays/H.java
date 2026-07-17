public class H {
    public static void main(String[] args) {

        int[] arr = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean ignore = false;

        for (int num : arr) {

            if (num == 6)
                ignore = true;

            if (!ignore)
                sum += num;

            if (num == 7)
                ignore = false;
        }

        System.out.println(sum);
    }
}
