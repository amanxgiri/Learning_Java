
import java.util.Scanner;

public class str_mtd {
    public static void main(String[] args) {

        // String name = "Aman Giri";

        // int length = name.length();
        // char at1st = name.charAt(0);
        // int idxOf = name.indexOf('a');
        // int lidxof = name.lastIndexOf('a');

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim(); removes the whitespaces
        // name.replace('a','l');
        //

        // name.isEmpty(); check it string is empty or not -> returns boolean
        // name.contains('a'); check it string is empty or not-> return boolean
        // name.equals("string"); check if name == strings -> return boolean
        // case-insensitve
        // name.equalsIgnoreCase("string")

        // .substring
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Email Addresss: ");
        String email = scanner.nextLine();

        if (email.isEmpty()) {
            System.out.println("You didn't Enter a Email.");
        } else {
            if (email.contains("@")) {
                int idxof = email.indexOf('@');
                String name = email.substring(0, idxof);

                String domain = email.substring(idxof + 1);

                System.out.println("Your username: " + name);
                System.out.println("Domain: " + domain);
            } else {
                System.out.println("Please Enter a valid Email!");
            }

        }

        scanner.close();

    }

}
