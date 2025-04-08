package college_lab.lab9.Ex2.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setName("John Doe");
        student.setRollNumber(1234);
        s
        student.displayDetails();
        student.name = "Jane Doe";       
        student.rollNumber = 5678;      
    }
}
