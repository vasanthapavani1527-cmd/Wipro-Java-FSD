import java.util.Scanner;

public class InterestCalculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("MAIN MENU");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option (1..4): ");

            int choice=sc.nextInt();

            try{

                switch(choice){

                    case 1:

                        System.out.print("Enter the Average amount in your account: ");
                        double amount=sc.nextDouble();

                        if(amount<0)
                            throw new InvalidAmountException("Invalid Amount");

                        sc.nextLine();

                        System.out.print("Enter Account Type (Normal/NRI): ");
                        String type=sc.nextLine();

                        SBAccount sb=new SBAccount(amount,type);

                        System.out.println("Interest gained: Rs. "+sb.calculateInterest());

                        break;

                    case 2:

                        System.out.print("Enter the FD amount: ");
                        amount=sc.nextDouble();

                        if(amount<0)
                            throw new InvalidAmountException("Invalid Amount");

                        System.out.print("Enter the number of days: ");
                        int days=sc.nextInt();

                        if(days<0)
                            throw new InvalidAmountException("Invalid Number of days. Please enter non-negative values.");

                        System.out.print("Enter your age: ");
                        int age=sc.nextInt();

                        FDAccount fd=new FDAccount(amount,days,age);

                        System.out.println("Interest gained is: Rs. "+fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter Monthly Amount: ");
                        double monthly=sc.nextDouble();

                        if(monthly<0)
                            throw new InvalidAmountException("Invalid Amount");

                        System.out.print("Enter Number of Months: ");
                        int months=sc.nextInt();

                        System.out.print("Enter Age: ");
                        age=sc.nextInt();

                        RDAccount rd=new RDAccount(monthly,months,age);

                        System.out.println("Interest gained is: Rs. "+rd.calculateInterest());

                        break;

                    case 4:
                        System.out.println("Thank You");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            }catch(InvalidAmountException e){

                System.out.println(e.getMessage());

            }

            System.out.println();
        }
    }
}
