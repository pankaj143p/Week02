package assistedProblems;
/*
Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager,
Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for
Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding
 superclass methods.

 */
// create a Employee class with some attributes
class Employee{
    String name;
    String id;
    long salary;
    Employee(String name, String id, long salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
//        System.out.println("Employees details are : ");
        System.out.println("Name of Employee: "+name+"\n"+"Id of employee : "+id+"\n"+"Salary of Employee: "+salary);
    }
}
class Manager extends Employee{
    int sizeOfTeam;
    Manager(String name, String id, long salary, int sizeOfTeam){
        super(name, id, salary);
        this.sizeOfTeam=sizeOfTeam;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
//        System.out.println("Manager details are : ");
        System.out.println("Size of a team : "+sizeOfTeam);
    }

}
class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name, String id, long salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
//        System.out.println("Developer details are : ");
        System.out.println("Programming language : "+programmingLanguage);
    }

}

class Intern extends Employee{
    private String learningTech;
    Intern(String name, String id, long salary, String learningTech){
        super(name, id, salary);
        this.learningTech=learningTech;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
//        System.out.println("Intern details are : ");
        System.out.println("Tech of Learning : "+learningTech);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
//        Employee m,d,i,e;
        Employee e=new Employee("Uday", "CD123",123000);
        Manager m=new Manager("Pankaj","al116",230000,125);
        Developer d=new Developer("Nishant","CS093",120000,"JavaScript");
        Intern i=new Intern("Saurabh","CS154",150,"Python");
        e.displayDetails();
        System.out.println("Details of Manager: ");
        m.displayDetails();
        System.out.println("Details of Developer: ");
        d.displayDetails();
        System.out.println("Details of Intern: ");
        i.displayDetails();
    }
}
