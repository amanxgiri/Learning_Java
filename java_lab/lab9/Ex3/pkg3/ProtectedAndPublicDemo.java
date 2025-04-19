package college_lab.lab9.Ex3.pkg3;

import college_lab.lab9.Ex3.pkg1.Department;
import college_lab.lab9.Ex3.pkg1.Course;
import college_lab.lab9.Ex3.pkg2.Subject;

public class ProtectedAndPublicDemo {
    public static void main(String[] args) {
        Course course = new Course();
        course.setDepartmentDetails("Computer Science", "CS");
        course.setCourseDetails("Computer Science Engineering", 4);
        course.displayCourseDetails();

        Subject subject = new Subject();
        subject.setSubjectDetails("Data Structures", 4);
        subject.displaySubjectDetails();

        // error in coz departmentName is protected
        course.departmentName = "New Department";

        // error in coz subjectName and sujectCredit is private
        subject.subjectName = "New Subject";
        subject.subjectCredits = 5;

        // No Error
        course.departmentCode = "CS-NEW";
    }
}
