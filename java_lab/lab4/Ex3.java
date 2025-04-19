// package lab4;

import java.util.Scanner;
import java.util.Random;

class BankAccount {
    String name;
    int accNo;
    String accType;
    double balance;
    static double rateOfInterest = 0.3;

    BankAccount() {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        accNo = 100000 + rn.nextInt(900000);
        System.out.println("Your acc Number: " + accNo);
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Type of Account (Saving,Current,Zero Balance): ");
        accType = sc.nextLine();

        System.out.println("======================");

        sc.close();
    }

    BankAccount(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully Deposited :" + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance.");
            System.out.println("Your Balance : " + balance);
            return;
        }

        balance -= amount;
        System.out.println("Sucessfully Withdrawn : " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Name : " + name);
        System.out.println("Accout Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }

    static void displayRateOfInterest() {
        System.out.println("Rate of Interest : " + rateOfInterest);
    }
}

class Ex3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        BankAccount acc2 = new BankAccount("Hi", 100001, "Saving", 5000);

        acc1.displayDetails();
        System.out.println("===============");
        acc2.displayDetails();

        acc2.deposit(1000);
        acc2.withdraw(200);
        BankAccount.displayRateOfInterest();

    }

}
