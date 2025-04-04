// package lab5;

import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);

    Subject[] subjects;
    String s_name;
    double average, total;
    int subCount;

    class Subject {
        String subjectName;
        double marks;

        public void assignMarks() {
            System.out.println("Enter Subject Name: ");
            subjectName = sc.nextLine();

            System.out.println("Enter Your Mark : ");
            marks = sc.nextDouble();
            sc.nextLine();
        }

        public void displaySubjectDetails() {
            System.out.println("Subject name: " + subjectName);
            System.out.println("Marks : " + marks);
        }
    }

    Student() {
        subjects = new Subject[10];
        subCount = 0;
        total = 0;
        average = 0;
        System.out.println("Enter Student Name: ");
        s_name = sc.nextLine();
    }

    Student(String name) {
        this.s_name = name;
        subjects = new Subject[10];
        subCount = 0;
        total = 0;
        average = 0;
    }

    public void addSubjects() {

        if (subCount >= 10) {
            System.out.println("More Than 10 Sujects Not allowed.");
            return;
        }

        subjects[subCount] = new Subject();
        subjects[subCount].assignMarks();
        subCount++;
    }

    public void calculate() {

        for (int i = 0; i < subCount; i++) {
            total += subjects[i].marks;
        }

        average = total / subCount;
    }

    public void display() {
        System.out.println("Student Name: " + s_name);
        for (int i = 0; i < subCount; i++) {
            System.out.println("Subject: " + subjects[i].subjectName);
            System.out.println("Marks: " + subjects[i].marks);
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

}

public class Ex1 {

    public static void main(String[] args) {
        Student aman = new Student();

        aman.addSubjects();
        aman.addSubjects();
        aman.calculate();
        aman.display();

        aman.addSubjects();
        aman.calculate();
        aman.display();
    }
}
