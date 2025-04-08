package college_lab.lab9.Ex3.pkg1;

public class Department {
    protected String departmentName;
    public String departmentCode;

    public void setDepartmentDetails(String name, String code) {
        this.departmentName = name;
        this.departmentCode = code;
    }

    public void displayDepartmentDetails() {
        System.out.println("Department Details:");
        System.out.println("Name: " + departmentName);
        System.out.println("Code: " + departmentCode);
    }
}
