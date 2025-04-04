import java.util.Scanner;

public class shop_cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;

        System.out.print("What Item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the Price? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        System.out.println("You have bought " + quantity + " " + item);
        System.err.println("Your total : $" + price * quantity);

        scanner.close();
    }

}
