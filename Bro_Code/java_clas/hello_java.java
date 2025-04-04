import java.util.Scanner;

public class hello_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Hello! Please enter your Name: ");
        name = scanner.nextLine();

        System.out.println("Hello Mr. " + name);

        scanner.close();
    }
}
