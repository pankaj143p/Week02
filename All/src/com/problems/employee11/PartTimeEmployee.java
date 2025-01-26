package src.com.problems.employee;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
          return getBaseSalary()+(hourlyRate*hoursWorked);
    }

    // method for display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}
