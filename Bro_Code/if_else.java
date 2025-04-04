import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        int age;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        name = scanner.nextLine();

        System.out.print("Enter you age: ");
        age = scanner.nextInt();

        // Group 1
        if (name.isEmpty()) {
            System.out.println("You didn't Enter a name.");
        } else {
            System.out.println("Hello " + name);
        }
        // Group 2
        if (age >= 18) {
            System.out.println("You are an Adult.");
        } else if (age < 0) {
            System.out.println("You are not born Yet.");
        } else if (age == 0) {
            System.out.println("You are a baby. ");
        } else {
            System.out.println("You are a child");
        }

        scanner.close();
    }

}
