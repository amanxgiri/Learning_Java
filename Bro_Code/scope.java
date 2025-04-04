public class scope {

    static int x = 3; // global scope

    public static void main(String[] args) {

        int x = 1; // local scope

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        int x = 2; // local scope
        System.out.println(x);
    }

}
