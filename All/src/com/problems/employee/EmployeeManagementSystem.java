
/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on
work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee
 reference.
 */

package src.com.problems.employee;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("101", "Nishant", 500000, 5000);
        Employee partTimeEmployee = new PartTimeEmployee("102", "Saurabh", 20, 2, 2);
        Department hrDepartment = new HRDepartment();
        hrDepartment.assignDepartment("Human Resources");
        Department itDepartment = new ITDepartment();
        itDepartment.assignDepartment("Information Technology");
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println("Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println(hrDepartment.getDepartmentDetails());
        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println("Salary: " + partTimeEmployee.calculateSalary());
        System.out.println(itDepartment.getDepartmentDetails());
    }
}
