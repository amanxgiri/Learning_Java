
import java.util.Scanner;

public class weight_con {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight, inLbs, inKgs;
        int choice;

        System.out.println("Welcome To Weight Converter.");

        System.out.println("Press 1 to Enter Weight in Kgs.");
        System.out.println("Press 2 to Enter Weight  Pounds.");
        System.out.println("Choose an Option.");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Please Enter the weight: ");
            weight = scanner.nextInt();

            inLbs = weight * 2.20;
            System.out.println("The Weight in Pounds: " + inLbs);

        } else if (choice == 2) {
            System.out.print("Please Enter the weight: ");
            weight = scanner.nextInt();

            inKgs = weight / 2.20;
            System.out.println("The Weight in kgs: " + inKgs);

        } else {
            System.out.println("Enter a valid choice.");

        }

        scanner.close();
    }
}