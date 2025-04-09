import java.util.Scanner;

class Mixer {
    int[] arr;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter the elements in ascending order (without duplicates):");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // Check if the element is in ascending order
            if (i > 0 && num <= arr[i - 1]) {
                System.out.println("Please enter a larger number than the previous one.");
                i--; // Retry input for this position
                continue;
            }

            // Check for duplicates
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    System.out.println("Duplicate entry! Please enter a different number.");
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                i--; // Retry input for this position
                continue;
            }

            arr[i] = num;
        }
    }

    Mixer mix(Mixer A) {
        Mixer result = new Mixer();

        if (this.arr == null || A.arr == null) {
            result.arr = new int[0];
            return result;
        }

        result.arr = new int[this.arr.length + A.arr.length];

        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                if (k == 0 || result.arr[k - 1] != this.arr[i])
                    result.arr[k++] = this.arr[i];
                i++;
            } else if (this.arr[i] > A.arr[j]) {
                if (k == 0 || result.arr[k - 1] != A.arr[j])
                    result.arr[k++] = A.arr[j];
                j++;
            } else {
                if (k == 0 || result.arr[k - 1] != this.arr[i])
                    result.arr[k++] = this.arr[i];
                i++;
                j++;
            }
        }

        while (i < this.arr.length) {
            if (k == 0 || result.arr[k - 1] != this.arr[i])
                result.arr[k++] = this.arr[i];
            i++;
        }

        while (j < A.arr.length) {
            if (k == 0 || result.arr[k - 1] != A.arr[j])
                result.arr[k++] = A.arr[j];
            j++;
        }

        int[] resized = new int[k];
        System.arraycopy(result.arr, 0, resized, 0, k);
        result.arr = resized;

        return result;
    }

    void display() {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Testing Mixer class to merge two sorted arrays");
        System.out.println("-----------------------------------------");

        // Create and initialize first Mixer object
        System.out.println("Enter details for first array:");
        Mixer m1 = new Mixer();
        m1.accept();

        // Create and initialize second Mixer object
        System.out.println("\nEnter details for second array:");
        Mixer m2 = new Mixer();
        m2.accept();

        // Display the contents of both arrays
        System.out.println("\nFirst array:");
        m1.display();

        System.out.println("\nSecond array:");
        m2.display();

        // Mix the arrays
        Mixer result = m1.mix(m2);

        // Display the merged result
        System.out.println("\nMerged array (ascending order with no duplicates):");
        result.display();
    }
}