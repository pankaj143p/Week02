package src.com.problems.employee;

public abstract class Employee {
    String employeeId;
    String name;
    double baseSalary;

    // abstract method to calculate salary
    abstract double calculateSalary();

    // constructor
    Employee(String employeeId, String name, double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    String department;
    public String getEmployeeId(String employeeId){
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // method for display employee details
    void displayDetails(){
        System.out.println("Employee Details : ");
        System.out.println("Employee Employee Id : "+employeeId);
        System.out.println("Employee Name : "+name);
        System.out.println("Salary of Employee "+name+" is: "+baseSalary);

    }

}
