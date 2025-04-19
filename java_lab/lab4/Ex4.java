// package lab4;

class Counter {

    static int count = 0;

    Counter() {
        count += 1;
    }

    static void showCount() {
        System.out.println("The Number of Objects Created : " + count);
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Counter cnt1 = new Counter();
        Counter cnt2 = new Counter();
        Counter cnt3 = new Counter();
        Counter cnt4 = new Counter();

        Counter.showCount();
    }

}
