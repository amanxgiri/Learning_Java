package college_lab.lab9.Ex2.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Aman");
        student.setRollNumber(1234);

        student.displayDetails();
        student.name = "Aman";
        student.rollNumber = 5678;
    }
}
