import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // consume the newline character entered.

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student. (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Years of age. ");
        System.out.println("Your GPA: " + gpa);
        if (isStudent) {
            System.out.println("You are a Student");
        } else {
            System.out.println("You are not a Student.");
        }

        scanner.close();

    }
}
