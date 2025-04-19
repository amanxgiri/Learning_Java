package college_lab.lab8;

import java.util.Scanner;

abstract class Figure {
    int x;
    int y;

    // Default constructor
    Figure() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x dimension: ");
        x = sc.nextInt();
        System.out.print("Enter y dimension: ");
        y = sc.nextInt();
        sc.nextLine(); // Consume newline
    }

    // Parameterized constructor
    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method to be implemented by subclasses
    abstract double area();

    // Display method
    void display() {
        System.out.println("Dimensions: x = " + x + ", y = " + y);
        System.out.println("Area = " + area());
    }
}

class Rectangle extends Figure {
    // Default constructor
    Rectangle() {
        super();
        System.out.println("Created a Rectangle");
    }

    // Parameterized constructor
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    double area() {
        return x * y;
    }

    @Override
    void display() {
        System.out.println("=== Rectangle ===");
        System.out.println("Length = " + x + ", Width = " + y);
        System.out.println("Area = " + area());
    }
}

class Triangle extends Figure {
    // Default constructor
    Triangle() {
        super();
        System.out.println("Created a Triangle");
    }

    // Parameterized constructor
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * x * y;
    }

    @Override
    void display() {
        System.out.println("=== Triangle ===");
        System.out.println("Base = " + x + ", Height = " + y);
        System.out.println("Area = " + area());
    }
}

class Square extends Figure {
    // Default constructor
    Square() {
        super();
        y = x; // Square has equal sides
        System.out.println("Created a Square");
    }

    // Parameterized constructor
    Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return x * x;
    }

    @Override
    void display() {
        System.out.println("=== Square ===");
        System.out.println("Side = " + x);
        System.out.println("Area = " + area());
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(10, 5);
        figures[1] = new Triangle(8, 4);
        figures[2] = new Square(6);

        for (Figure figure : figures) {
            figure.display();
            System.out.println("------------------------");
        }
    }
}
