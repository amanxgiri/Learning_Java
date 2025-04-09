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
        basic = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
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
        sc.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[n];
        System.out.println("Enter details of Employee: ");

        // Use traditional for loop with index to properly initialize the array
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].read();
            employees[i].compute();
        }

        System.out.println("Employee details: ");
        for (Employee employee : employees) {
            employee.display();
            System.out.println("----------------");
        }

        sc.close();
    }

}
