import java.util.ArrayList;
import java.util.function.Function;

class Employee {

    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class A {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Anil", "Hyderabad", 25000));
        empList.add(new Employee(102, "Bhavya", "Pune", 30000));
        empList.add(new Employee(103, "Charan", "Chennai", 28000));
        empList.add(new Employee(104, "Deepika", "Delhi", 35000));
        empList.add(new Employee(105, "Eswar", "Mumbai", 27000));

        Function<Employee, String> fun = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        empList.forEach(e -> locations.add(fun.apply(e)));

        System.out.println(locations);
    }
}