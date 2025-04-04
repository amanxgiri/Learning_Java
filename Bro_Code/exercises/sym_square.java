import java.util.Scanner;

public class sym_square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row, cols;

        System.out.print("Enter the Number of Rows: ");
        row = scanner.nextInt();

        System.out.print("Enter the Number of columns: ");
        cols = scanner.nextInt();

        scanner.nextLine();
        System.out.print("The Symbol to Print: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
