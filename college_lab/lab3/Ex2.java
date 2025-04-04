import java.util.Scanner;

class Employee {

    String e_name;
    int eid;
    double basic, da, grossSal, netSal;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        e_name = sc.nextLine();
        System.out.println("Enter Employee Id: ");
        eid = sc.nextInt();
        System.out.println("Enter Basic Salary: ");
        basic = sc.nextInt();
        sc.close();
    }

    void compute() {
        da = 0.52 * basic;
        grossSal = da + basic;
        double it = 0.3 * grossSal;
        netSal = grossSal - it;
    }

    void display() {
        System.out.println("Employee Name: " + e_name);
        System.out.println("Enter Employee Id: " + eid);
        System.out.println("Enter Net Salary: " + netSal);
    }

}

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
        System.out.println("Enter details of Employee: ");
        for (Employee employee : employees) {
            employee = new Employee();
            employee.read();
            employee.compute();
        }
        System.out.println("Employee details: ");
        for (Employee employee : employees) {
            employee.display();
            System.out.println("----------------");
        }

        sc.close();
    }

}
