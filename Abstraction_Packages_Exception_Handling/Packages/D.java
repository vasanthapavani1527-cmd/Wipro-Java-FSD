import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class D {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("Logan Details");
        System.out.println("Model : " + l.getModelName());
        System.out.println("Registration : " + l.getRegistrationNumber());
        System.out.println("Owner : " + l.getOwnerName());
        System.out.println("Speed : " + l.speed());

        l.gps();

        System.out.println();

        Ford f = new Ford();

        System.out.println("Ford Details");
        System.out.println("Model : " + f.getModelName());
        System.out.println("Registration : " + f.getRegistrationNumber());
        System.out.println("Owner : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed());

        f.tempControl();

    }
}
