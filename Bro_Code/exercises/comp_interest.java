
import java.util.Scanner;

public class comp_interest {
    public static void main(String[] args) {

        // P(1+r/n )^nt

        Scanner scanner = new Scanner(System.in);

        double p, r, n, t;
        double ci;

        System.out.print("Enter the Principal Amount.");
        p = scanner.nextDouble();

        System.out.print("Enter the rate of interest in percent.");
        r = scanner.nextDouble() / 100;

        System.out.print("Enter the Number of Times the Interest in compounded in a year.");
        n = scanner.nextDouble();

        System.out.print("Enter the Time: ");
        t = scanner.nextDouble();

        ci = p * Math.pow((1 + (r / n)), n * t);

        System.out.printf("The Compound Interest: %.3f", ci);

        scanner.close();
    }
}
