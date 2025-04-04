// package lab4;

import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    double[] marks_array;
    String s_name;
    double avg;
    double total;
    int n;

    // default constructor
    Student() {
        System.out.println("Enter the Number of Subjects: ");
        n = sc.nextInt();
        sc.nextLine(); // consume the newline character(\n) generated by .nextInt()
        marks_array = new double[n];
    }

    // parameterised constructor
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

public class Ex1 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.assign();
        s1.compute();
        s1.display();

        double[] marks = { 10, 13, 15 };

        Student s2 = new Student("Aman", 3, marks);
        s2.compute();
        s2.display();

    }
}
