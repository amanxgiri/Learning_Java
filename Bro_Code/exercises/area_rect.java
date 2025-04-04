
import java.util.Scanner;

public class area_rect {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of the Rectangle. ");
        double len = input.nextDouble();

        System.out.print("Enter the Breadth of Rectange: ");
        double bre = input.nextDouble();

        double area = len * bre;

        System.out.println("Dimension of Recatangle: ");
        System.out.println("lenght = " + len + " breadth = " + bre);
        System.out.println("Area = " + area + "cm²");

        input.close();
    }

}
