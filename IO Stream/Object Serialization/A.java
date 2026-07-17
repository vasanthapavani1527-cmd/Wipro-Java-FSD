import java.io.*;
import java.util.Date;

class Employee implements Serializable {

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department,
                    String designation, double salary) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class A {

    public static void main(String[] args) {

        try {

            // Create Employee object
            Employee emp = new Employee(
                    "Siva",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    50000.0);

            // Serialization
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

            // Deserialization
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nEmployee Details");
            System.out.println("-------------------------");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
