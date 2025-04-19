package college_lab.lab9.Ex3.pkg1;

public class Course extends Department {
    private String courseName;
    private int courseDuration;

    public void setCourseDetails(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public void displayCourseDetails() {
        displayDepartmentDetails();
        System.out.println("Course Details:");
        System.out.println("Name: " + courseName);
        System.out.println("Duration: " + courseDuration + " years");
    }
}
