import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class C {

    public static void main(String[] args) {

        Hero h = new Hero();

        System.out.println("Hero Details");
        System.out.println("Model : " + h.getModelName());
        System.out.println("Registration : " + h.getRegistrationNumber());
        System.out.println("Owner : " + h.getOwnerName());
        System.out.println("Speed : " + h.getSpeed());

        h.radio();

        System.out.println();

        Honda hd = new Honda();

        System.out.println("Honda Details");
        System.out.println("Model : " + hd.getModelName());
        System.out.println("Registration : " + hd.getRegistrationNumber());
        System.out.println("Owner : " + hd.getOwnerName());
        System.out.println("Speed : " + hd.getSpeed());

        hd.cdplayer();

    }
}
