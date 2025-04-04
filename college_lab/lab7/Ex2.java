// package lab7;

import java.util.Scanner;

class Employee {
    String e_name;
    int eid;
    double basic, da, grossSal, netSal;

    // Default constructor
    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        e_name = sc.nextLine();
        System.out.println("Enter Employee Id: ");
        eid = sc.nextInt();
        System.out.println("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    // Parameterized constructor
    Employee(String name, int id, double basicSalary) {
        this.e_name = name;
        this.eid = id;
        this.basic = basicSalary;
    }

    void compute() {
        da = 0.52 * basic;
        grossSal = da + basic;
        double it = 0.3 * grossSal;
        netSal = grossSal - it;
    }

    void display() {
        System.out.println("Employee Name: " + e_name);
        System.out.println("Employee Id: " + eid);
        System.out.println("Net Salary: " + netSal);
    }
}

class FullTimeEmp extends Employee {
    double bonus, deductions;

    // Default constructor
    FullTimeEmp() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bonus: ");
        bonus = sc.nextDouble();
        System.out.println("Enter Deductions: ");
        deductions = sc.nextDouble();
    }

    // Parameterized constructor
    FullTimeEmp(String name, int id, double basicSalary, double bonus, double deductions) {
        super(name, id, basicSalary);
        this.bonus = bonus;
        this.deductions = deductions;
    }

    @Override
    void compute() {
        super.compute();
        netSal = netSal + bonus - deductions;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

class PartTimeEmp extends Employee {
    int hoursWorked;
    static final double hourlyRate = 200.0;

    // Default constructor
    PartTimeEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        e_name = sc.nextLine();
        System.out.println("Enter Employee Id: ");
        eid = sc.nextInt();
        System.out.println("Enter Hours Worked: ");
        hoursWorked = sc.nextInt();
    }

    // Parameterized constructor
    PartTimeEmp(String name, int id, int hoursWorked) {
        super(name, id, hoursWorked * hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void compute() {
        basic = hoursWorked * hourlyRate;
        da = 0.52 * basic;
        grossSal = da + basic;
        double it = 0.3 * grossSal;
        netSal = grossSal - it;
    }

    @Override
    void display() {
        System.out.println("Employee Name: " + e_name);
        System.out.println("Employee Id: " + eid);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Net Salary: " + netSal);
    }
}

public class Ex2 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Alex Green", 104, 45000);
        employees[1] = new FullTimeEmp("Maria Brown", 105, 55000, 8000, 3000);
        employees[2] = new PartTimeEmp("Tom Wilson", 106, 35);

        for (Employee emp : employees) {
            emp.compute();
            emp.display();
            System.out.println("------------------------");
        }
    }
}
