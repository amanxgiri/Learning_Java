import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*******************");
            System.out.println(" BANKING PROGRAM.");
            System.out.println("*******************");
            System.out.println("1.  Show Balance");
            System.out.println("2.  Deposit");
            System.out.println("3.  Withdraw");
            System.out.println("4.  Exit");
            System.out.println("*******************");

            System.out.print("Enter Your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit(balance);
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice.");
            }
        }
        System.out.println("*******************");
        System.out.println("Thank You! For Banking . Have an Nice day!");
        System.out.println("*******************");

        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.println("*******************");
        System.out.printf("Your Balance: $%.2f \n", balance);
    }

    static double deposit(double balance) {
        double amount;

        System.out.println("*******************");
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount Can't be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("*******************");
            System.out.println("Insufficient Funds");
            System.out.printf("Your Balance: $%.2f\n", balance);
            return 0;

        } else if (amount < 0) {
            System.out.println("Amount Can't Be Negative.");
            return 0;
        } else {
            return amount;
        }
    }

}
