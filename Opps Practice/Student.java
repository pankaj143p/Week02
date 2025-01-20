// This program demonstrates the use of static and instance variables, static and instance methods, and static and instance blocks in a class.
public class Student {
    static String universityName;
    static int totalStudents;
    final int rollNumber;
    String name;
    char grade;
    static {
        universityName = "XYZ University";
    }
   
    // Create a constructor to initialize the attributes of the Student class.
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
         totalStudents++;
        
    }
    // Create a static method displayTotalStudents to display the total number of students.
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    // Create a static method isStudent which returns true if the object is an instance of the Student class.
    public static boolean isStudent(Student student) {
        return student instanceof Student;
    }
    // Create a method toString to display the student details.
    public String toString() {
        return "Name: " + name + "\nRoll Number: " + rollNumber + "\nGrade: " + grade;
    }
    // Create a method updateGrade to update the grade of the student.
    public void updateGrade(char newGrade) {
        if (isStudent(this)) {
            this.grade = newGrade;
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Neeraj", 1, 'A');
        Student student2 = new Student("Nishant", 2, 'B');
        Student student3 = new Student("Anil", 3, 'C');
        Student.displayTotalStudents();
        System.out.println(Student.isStudent(student1));
        System.out.println(Student.isStudent(student2));
        System.out.println(Student.isStudent(student3));
        student1.updateGrade('B');
        student2.updateGrade('C');
        student3.updateGrade('D');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
    
}
