package src.com.problems.employee;

public class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    public double getBonus(double bonus){
        return bonus;
    }


    public double calculateSalary(){
       return getBaseSalary()+bonus;
    }
    // display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus :" + bonus);
    }
}
