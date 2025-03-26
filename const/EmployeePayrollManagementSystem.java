
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private String name;
    private int employeeID;
    private double salary;
    private String department;

    // Default constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0.0;
        this.department = "Unknown";
    }

    // Parameterized constructor
    public Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    // Instance methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.printf("Salary: $%.2f%n", salary);
        System.out.println("Department: " + department);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeePayrollManagementSystem {

    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Welcome to the Employee Payroll Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    giveSalaryRaise();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        Employee employee = new Employee(name, employeeID, salary, department);
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    private static void viewAllEmployees() {
        System.out.println("--- Employee Records ---");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees.get(i).displayInfo();
            System.out.println();
        }
    }

    private static void calculateAnnualSalary() {
        System.out.print("Enter employee ID to calculate salary: ");
        int employeeID = scanner.nextInt();
        Employee employee = findEmployeeByID(employeeID);
        if (employee != null) {
            double annualSalary = employee.calculateAnnualSalary();
            System.out.printf("Annual Salary of %s: $%.2f%n", employee.getName(), annualSalary);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void giveSalaryRaise() {
        System.out.print("Enter employee ID to raise salary: ");
        int employeeID = scanner.nextInt();
        Employee employee = findEmployeeByID(employeeID);
        if (employee != null) {
            System.out.print("Enter percentage increase: ");
            double percentage = scanner.nextDouble();
            employee.raiseSalary(percentage);
            System.out.printf("Salary updated successfully! New Salary: $%.2f%n", employee.getSalary());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static Employee findEmployeeByID(int employeeID) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null; // Employee not found
    }
}
