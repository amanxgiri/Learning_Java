import java.util.Scanner;

public class star {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Enter Your Number: ");
        a = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("X");
            }
            System.out.print("\n");

        }

        scanner.close();
    }
}
