import java.util.ArrayList;

class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentStore {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // 1.
        students.add(new Student("Ali", 3.8));
        students.add(new Student("Sara", 3.2));
        students.add(new Student("Ahmed", 1.9));
        students.add(new Student("Ayesha", 3.9));
        students.add(new Student("Bilal", 2.5));

        // 2.
        students.removeIf(s -> s.gpa < 2.0);

        // 3. Find topper student
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.gpa > topper.gpa) {
                topper = s;
            }
        }

        // 4.
        int deanCount = 0;
        for (Student s : students) {
            if (s.gpa > 3.5) {
                deanCount++;
            }
        }

        //Results
        System.out.println("Topper: " + topper.name + " GPA: " + topper.gpa);
        System.out.println("Dean's List Students: " + deanCount);
    }
}