package arrays;

public class array {
    public static void main(String[] args) {
        // array declarations: by puting datatype[] array_name = {values}

        String[] fruits = { "Apple", "Banana", "Java", "Python" };

        // getting length of by .length
        // int lenOfFruits = fruits.length;

        // printing values of array by for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // enhnaced for loop or for each loop
        for (String fruit : fruits) {
            System.err.println(fruit);
        }
    }
}