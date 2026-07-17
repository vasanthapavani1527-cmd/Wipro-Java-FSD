import test.Foundation;

public class A {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // obj.var1; // Private - Not Accessible
        // obj.var2; // Default - Not Accessible
        // obj.var3; // Protected - Not Accessible

        System.out.println("Public Variable : " + obj.var4);

        obj.display();
    }
}