import java.util.ArrayList;

class Employee {

    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}

public class B {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Anil", 25, "Hyderabad"));
        list.add(new Employee(102, "Bhavya", 24, "Pune"));
        list.add(new Employee(103, "Charan", 27, "Delhi"));
        list.add(new Employee(104, "Deepika", 23, "Pune"));
        list.add(new Employee(105, "Eswar", 26, "Chennai"));

        ArrayList<Employee> result = new ArrayList<>();

        list.forEach(emp -> {
            if (emp.location.equals("Pune")) {
                result.add(emp);
            }
        });

        result.forEach(System.out::println);
    }
}
