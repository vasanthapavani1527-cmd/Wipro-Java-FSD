import java.util.*;

class Employee {

    int empId;
    String empName;
    String department;
    double salary;

    Employee(int empId, String empName,
             String department, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {

        return "Employee ID : " + empId +
               "\nName : " + empName +
               "\nDepartment : " + department +
               "\nSalary : " + salary + "\n";
    }
}

public class G {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Siva", "IT", 50000));
        employees.add(new Employee(102, "Vinay", "HR", 45000));
        employees.add(new Employee(103, "Rahul", "Finance", 55000));

        System.out.println("Using Iterator\n");

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

        System.out.println("Using Enumeration\n");

        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {

            System.out.println(en.nextElement());

        }
    }
}
