package college_lab.lab9.Ex2.manipal.kmc;

public class Subject {
    private String subjectName;
    private int subjectCredits;

    public void setSubjectDetails(String name, int credits) {
        this.subjectName = name;
        this.subjectCredits = credits;
    }

    public void displaySubjectDetails() {
        System.out.println("Subject Details:");
        System.out.println("Name: " + subjectName);
        System.out.println("Credits: " + subjectCredits);
    }
}
