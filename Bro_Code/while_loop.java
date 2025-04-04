import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        while (name.isEmpty()) {
            System.out.println("Please Enter a valid Name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello " + name);

        scanner.close();
    }

}
