public class D {

    public static void main(String[] args) {

        try{

            if(args.length!=5){
                System.out.println("Please enter exactly 5 integers.");
                return;
            }

            int sum=0;

            for(int i=0;i<5;i++)
                sum+=Integer.parseInt(args[i]);

            double avg=sum/5.0;

            System.out.println("Sum = "+sum);
            System.out.println("Average = "+avg);

        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
