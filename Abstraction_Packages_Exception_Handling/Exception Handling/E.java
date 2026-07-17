import java.util.Scanner;

public class E {

    static int divide(int a,int b) throws ArithmeticException{

        return a/b;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        try{

            int result=divide(a,b);

            System.out.println("Result = "+result);

        }
        catch(ArithmeticException e){

            System.out.println("Cannot divide by zero.");

        }

    }

}
