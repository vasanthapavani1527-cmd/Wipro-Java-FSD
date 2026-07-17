interface WordCount {
    int count(String str);
}

public class D {

    public static void main(String[] args) {

        WordCount wc = str -> str.split("\\s+").length;

        String s = "Welcome to Java Programming";

        System.out.println("Number of words = " + wc.count(s));
    }
}
