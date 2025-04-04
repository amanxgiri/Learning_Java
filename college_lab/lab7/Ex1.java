
import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    double[] marks_array;
    String s_name;
    double avg;
    double total;
    int n;

    Student() {
        System.out.println("Enter the Number of Subjects: ");
        n = sc.nextInt();
        sc.nextLine();
        marks_array = new double[n];
    }

    Student(String name, int n, double[] marks) {
        this.s_name = name;
        marks_array = new double[n];
        this.marks_array = marks;

    }

    void assign() {
        System.out.print("What is the Name: ");
        s_name = sc.nextLine();
        System.out.println("\nEnter marks of subject: ");
        for (int i = 0; i < marks_array.length; i++) {
            System.out.print("suject " + (i + 1) + " ");
            marks_array[i] = sc.nextDouble();
        }
    }

    void compute() {
        for (int i = 0; i < marks_array.length; i++) {
            total += marks_array[i];
        }
        avg = total / marks_array.length;
    }

    void display() {
        System.out.println("Student Name: " + s_name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);

    }
}

class ScienceStudent extends Student {
    int practicalMarks;

    ScienceStudent() {
        super();
        System.out.print("Enter Practical Marks: ");
        practicalMarks = sc.nextInt();
        sc.nextLine();
    }

    ScienceStudent(String name, int n, double[] marks, int practicalMarks) {
        super(name, n, marks);
        this.practicalMarks = practicalMarks;
    }

    @Override
    void compute() {
        total = 0;
        for (int i = 0; i < marks_array.length; i++) {
            total += marks_array[i];
        }
        total += practicalMarks;
        avg = total / (marks_array.length + 1);
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    @Override
    void display() {
        super.display();
        displayPracticalMarks();
    }
}

class ArtsStudent extends Student {
    String electiveSubject;

    ArtsStudent() {
        super();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
    }

    ArtsStudent(String name, int n, double[] marks, String electiveSubject) {
        super(name, n, marks);
        this.electiveSubject = electiveSubject;
    }

    void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }

    @Override
    void display() {
        super.display();
        displayElectiveSubject();
    }
}

public class Ex1 {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Regular Student", 3, new double[] { 85, 90, 78 });
        students[1] = new ScienceStudent("Science Student", 3, new double[] { 82, 88, 75 }, 92);
        students[2] = new ArtsStudent("Arts Student", 3, new double[] { 75, 92, 85 }, "Psychology");

        for (Student student : students) {
            student.compute();
            student.display();
            System.out.println("------------------------");
        }
    }
}