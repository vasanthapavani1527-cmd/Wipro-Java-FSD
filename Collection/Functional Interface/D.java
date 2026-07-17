import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class D {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Anil", 8000));
        list.add(new Employee(102, "Bhavya", 12000));
        list.add(new Employee(103, "Charan", 9500));
        list.add(new Employee(104, "Deepika", 15000));
        list.add(new Employee(105, "Eswar", 7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));
    }
}