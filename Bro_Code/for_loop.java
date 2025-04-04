import java.util.Scanner;

public class for_loop {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times do You want to Print? : ");
        int times = scanner.nextInt();

        for (int i = times; i > 0; i++) {
            System.out.println(i);
            Thread.sleep(1000); // stops The program for milliseconds
        }
        System.out.println("Happy New Year.");

        scanner.close();
    }
}
