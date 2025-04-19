// package college_lab.lab10;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    void registerStudent(String name, int age) {
        this.name = name;
        try {
            System.out.println("Trying to Register.");
            if (age > 18 && age < 60) {
                this.age = age;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Registration Failed (Reason Below):");
            System.out.println("Age should be between 18 and 60.");
        }
    }
}

class StudentAgeValidationDemo {

    public static void verify() {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[2];
        String name;
        int age;
        for (Student student : s) {
            student = new Student();
            System.out.println("Enter Name of Student: ");
            name = sc.nextLine();
            System.out.println("Enter Age of Student");
            age = sc.nextInt();
            sc.nextLine();
            student.registerStudent(name, age);

        }
    }
}

public class Ex1 {

    public static void main(String[] args) {
        StudentAgeValidationDemo.verify();
    }

}
