class Student {
    public double calculateAverage(int totalMarks, int numberOfSubjects) throws ArithmeticException {
        if (totalMarks == 0 || numberOfSubjects == 0) {
            throw new ArithmeticException("Cannot calculate average: totalMarks or numberOfSubjects is zero");
        }

        return (double) totalMarks / numberOfSubjects;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        MarksValidationDemo.testAverageCalculation();
    }
}

class MarksValidationDemo {
    public static void testAverageCalculation() {
        Student student = new Student();

        // Test with valid data
        try {
            int totalMarks = 450;
            int numberOfSubjects = 5;
            double average = student.calculateAverage(totalMarks, numberOfSubjects);
            System.out.println("Average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test with invalid data - total marks zero
        try {
            int totalMarks = 0;
            int numberOfSubjects = 5;
            double average = student.calculateAverage(totalMarks, numberOfSubjects);
            System.out.println("Average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test with invalid data - number of subjects zero
        try {
            int totalMarks = 450;
            int numberOfSubjects = 0;
            double average = student.calculateAverage(totalMarks, numberOfSubjects);
            System.out.println("Average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
