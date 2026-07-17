class Person {

    private String name;
    private String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}

class Teacher extends Person {

    private double salary;
    private String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacher() {
        System.out.println("Teacher Name : " + getName());
        System.out.println("DOB : " + getDateOfBirth());
        System.out.println("Salary : " + salary);
        System.out.println("Subject : " + subject);
    }
}

class Student extends Person {

    private int studentId;

    Student(String name, String dateOfBirth, int studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class CollegeStudent extends Student {

    private String collegeName;
    private String year;

    CollegeStudent(String name, String dateOfBirth, int studentId, String collegeName, String year) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    void displayCollegeStudent() {
        System.out.println("Student Name : " + getName());
        System.out.println("DOB : " + getDateOfBirth());
        System.out.println("Student ID : " + getStudentId());
        System.out.println("College : " + collegeName);
        System.out.println("Year : " + year);
    }
}

public class C {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ramesh", "10-05-1985", 60000, "Java");

        Student student = new Student("Siva", "21-09-2005", 101);

        CollegeStudent collegeStudent = new CollegeStudent(
                "Jyothi",
                "15-08-2004",
                102,
                "ABC Engineering College",
                "Fourth");

        System.out.println("Teacher Details");
        teacher.displayTeacher();

        System.out.println();

        System.out.println("Student Details");
        System.out.println("Name : " + student.getName());
        System.out.println("DOB : " + student.getDateOfBirth());
        System.out.println("Student ID : " + student.getStudentId());

        System.out.println();

        System.out.println("College Student Details");
        collegeStudent.displayCollegeStudent();
    }
}
