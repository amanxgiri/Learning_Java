package college_lab.lab7;

import java.util.Scanner;

class Building {
    double squareFootage;
    int stories;

    Building() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Square Footage: ");
        squareFootage = sc.nextDouble();
        System.out.print("Enter Number of Stories: ");
        stories = sc.nextInt();
        sc.nextLine();
    }

    Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    void display() {
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Number of Stories: " + stories);
    }
}

class House extends Building {
    int bedrooms;
    int bathrooms;

    House() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Bedrooms: ");
        bedrooms = sc.nextInt();
        System.out.print("Enter Number of Bathrooms: ");
        bathrooms = sc.nextInt();
        sc.nextLine();
    }

    House(double squareFootage, int stories, int bedrooms, int bathrooms) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    @Override
    void display() {
        System.out.println("=== House Details ===");
        super.display();
        System.out.println("Number of Bedrooms: " + bedrooms);
        System.out.println("Number of Bathrooms: " + bathrooms);
    }
}

class School extends Building {
    int classrooms;
    String gradeLevel;

    School() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Classrooms: ");
        classrooms = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade Level (e.g., Elementary, Junior High): ");
        gradeLevel = sc.nextLine();
    }

    School(double squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    @Override
    void display() {
        System.out.println("=== School Details ===");
        super.display();
        System.out.println("Number of Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class Ex3 {
    public static void main(String[] args) {

        Building building = new Building(5000, 2);
        House house = new House(2500, 2, 4, 3);
        School school = new School(15000, 3, 35, "Elementary");

        building.display();
        System.out.println();
        house.display();
        System.out.println();
        school.display();

    }
}
