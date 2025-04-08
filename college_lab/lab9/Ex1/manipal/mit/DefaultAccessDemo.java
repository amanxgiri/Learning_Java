package college_lab.lab9.manipal.mit;

public class DefaultAccessDemo {
    public static void main(String[] args) {

        // works fine since in same package
        Student student = new Student();
        student.name = "Aman Giri";
        student.rollNumber = 1234;
        student.displayDetails();

    }
}
