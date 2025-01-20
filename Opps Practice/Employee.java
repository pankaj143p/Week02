public class Employee {
    static String companyName = "Capgemini";
    static int totalEmployees = 0;
    private final int id;
    String name;
    String designation;
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
        totalEmployees++;
        this.id = 1000 + totalEmployees;
    }
    public static String getCompanyName() {
        return companyName;
    }
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Designation: " + designation);
        }
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Software Developer");
        Employee emp2 = new Employee("Doe", "Software Engineer");
        Employee.displayTotalEmployees();
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
    }
    
}