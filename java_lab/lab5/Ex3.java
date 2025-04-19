

import java.util.Scanner;

class ShoppingCart {

    Item[] items;
    int itemCount;
    double totalPrice;

    Scanner sc = new Scanner(System.in);

    class Item {
        String itemName;
        int quantity;
        double price;

        Item(String name, int quantity, double price) {
            this.itemName = name;
            this.quantity = quantity;
            this.price = price;
        }

        public double getItemTotal() {
            return price * quantity;
        }

        public void displayItem() {
            System.out.println("Item Name: " + itemName);
            System.out.println("Item price : " + price);
            System.out.println("Item Quantity : " + quantity);
        }

    }

    public ShoppingCart() {
        items = new Item[100];
        itemCount = 0;
        totalPrice = 0.0;
    }

    public void addItem() {

        if (itemCount >= 100) {
            System.out.println("Print Cart is Full.");
            return;
        }

        System.out.println("Enter item name: ");
        String name = sc.nextLine();

        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        items[itemCount] = new Item(name, quantity, price);
        itemCount++;
    }

    public void calculateTotal() {

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getItemTotal();
        }
    }

    public void displayCart() {

        for (int i = 0; i < itemCount; i++) {
            items[i].displayItem();
            System.out.println("================");
        }

        System.out.println("Total Price " + totalPrice);
    }
}

public class Ex3 {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem();
        cart.addItem();
        cart.addItem();

        cart.calculateTotal();
        cart.displayCart();

        cart.addItem();
        cart.calculateTotal();
        cart.displayCart();
    }
}
