import java.time.LocalDate;
import java.time.Period;

public class C {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2026, 6, 1); // Change if needed
        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println(p.getYears() + " Years "
                + p.getMonths() + " Months "
                + p.getDays() + " Days");
    }
}