import java.util.ArrayList;

class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email,
             String gender, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {

        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                list.remove(e);
                return true;
            }
        }

        return false;
    }

    String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.empId == empId)

                return "Pay Slip of " + e.empName +
                        "\nSalary : " + e.salary;
        }

        return "Employee Not Found";
    }

    void displayEmployees() {

        for (Employee e : list)

            e.getEmployeeDetails();
    }
}

public class B {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101,
                "Siva",
                "siva@gmail.com",
                "Female",
                50000));

        db.addEmployee(new Employee(102,
                "Vinay",
                "vinay@gmail.com",
                "Male",
                60000));

        db.displayEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion");

        db.displayEmployees();
    }
}
