import java.util.Scanner;

public class math_c {
    public static void main(String[] args) {

        // Que 1
        // double hyp, a, b;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a: ");
        // a = scanner.nextDouble();

        // System.out.println("Enter b: ");
        // b = scanner.nextDouble();

        // hyp = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // System.out.println("The Hypotenus of Triangle with sides a = " + a + " b = "
        // + b + "= " + hyp);

        // scanner.close();

        // Que 2 Calc Area , circumference of a circle with radius r

        Scanner scanner = new Scanner(System.in);
        double r, area, circumference;

        System.out.print("Enter the radius of circle. ");
        r = scanner.nextDouble();

        area = Math.PI * Math.pow(r, 2);
        circumference = 2 * Math.PI * r;

        // System.out.println("The circumference of cirlce of radius " + r + " is " +
        // circumference);
        // System.out.println("The Area of cirlce of radius " + r + " is " + area);
        System.out.printf("The circumference of cirlce of radius %.2f  is %.1f \n", r, circumference);
        System.out.printf("The Area of cirlce of radius %f  is %.2f \n", r, area);
        scanner.close();
    }

}
