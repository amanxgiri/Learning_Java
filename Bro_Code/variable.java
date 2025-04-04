public class variable {

    public static void main(String[] args) {
        int age = 10;
        double price = 12.99;
        boolean isStudent = true;

        String name = "Bro";
        String food = "pizza";

        System.out.println("Hello" + name);
        System.out.println("You like " + food);

        if (age < 20) {
            if (isStudent) {
                System.out.println(name + " You are student.");
            } else {
                System.out.println("You are not a student.");
            }
        }
    }
}
