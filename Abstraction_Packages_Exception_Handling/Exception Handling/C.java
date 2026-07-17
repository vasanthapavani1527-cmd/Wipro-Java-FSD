import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try{

            System.out.print("Enter the number of elements in the array: ");
            int n=Integer.parseInt(sc.nextLine());

            int arr[]=new int[n];

            System.out.println("Enter the elements:");

            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(sc.nextLine());

            System.out.print("Enter the index: ");
            int index=Integer.parseInt(sc.nextLine());

            System.out.println("The array element at index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass().getName());
        }
        catch(NumberFormatException e){
            System.out.println(e.getClass().getName());
        }

    }
}
