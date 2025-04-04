import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.close();
    }

    static void birthdaySong() {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your age: ");
        age = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            happyBirthday(name, age);
        }
        scanner.close();
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday To you!");
        System.out.printf("Happy Birthday To you Dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday To You!");
    }

    static double cube(double x) {
        return x * x * x;
    }

    static double square(double x) {
        return x * x;
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;

    }

    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
