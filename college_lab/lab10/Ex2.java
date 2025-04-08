import java.util.Scanner;

// Custom checked exception for course capacity
class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    // Default constructor
    Course() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        courseName = sc.nextLine();
        System.out.print("Enter Course Capacity: ");
        capacity = sc.nextInt();
        enrolledStudents = 0;
    }

    // Parameterized constructor
    Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    // Method to enroll a student
    public void enrollStudent() throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Course is full! Maximum capacity of " + capacity + " reached.");
        }

        enrolledStudents++;
        System.out.println("Student enrolled successfully. Total enrolled: " + enrolledStudents);
    }

    // Method to display course details
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Capacity: " + capacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Available Seats: " + (capacity - enrolledStudents));
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}

class CourseCapacityDemo {
    public static void enrollmentDemo() {
        Scanner sc = new Scanner(System.in);

        // Create a course with fixed capacity
        Course javaCourse = new Course("Java Programming", 3);
        System.out.println("Created course: " + javaCourse.getCourseName());

        // Enrollment loop
        boolean continueEnrolling = true;
        while (continueEnrolling) {
            System.out.println("\nCurrent course status:");
            javaCourse.displayCourseInfo();

            System.out.print("\nDo you want to enroll a student? (y/n): ");
            String response = sc.nextLine();

            if (response.equalsIgnoreCase("y")) {
                try {
                    javaCourse.enrollStudent();
                } catch (CourseFullException e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Cannot enroll more students!");
                }
            } else {
                continueEnrolling = false;
            }
        }

        System.out.println("\nFinal course status:");
        javaCourse.displayCourseInfo();
    }
}

public class Ex2 {
    public static void main(String[] args) {
        CourseCapacityDemo.enrollmentDemo();
    }
}
