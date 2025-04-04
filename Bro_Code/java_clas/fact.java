
import java.util.Scanner;

public class fact {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        a = scanner.nextInt();

        int res = factorial(a);

        System.out.printf("The factorial of %d is %d", a, res);

        scanner.close();
    }

    public static int factorial(int a) {
        int res = 1;

        for (int i = 1; i <= a; i++) {
            res *= i;
        }

        return res;

    }

}