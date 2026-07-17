import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class C {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Anil", 70));
        list.add(new Student(2, "Bhavya", 45));
        list.add(new Student(3, "Charan", 60));
        list.add(new Student(4, "Deepika", 50));
        list.add(new Student(5, "Eswar", 30));

        long count = list.stream()
                     
        .filter(s -> s.mark >= 50)
                         .count();

        System.out.println("Students Cleared = " + count);
    }
}