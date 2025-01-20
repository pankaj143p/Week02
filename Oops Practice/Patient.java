// class Patient
public class Patient {
    static String hospitalName;
    static int totalPatients;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    private static int nextPatientID = 1;
    // Create a static method getTotalPatients to return the total number of patients.
    static int getTotalPatients() {
        return totalPatients;
    }   
    // Create a constructor to initialize the instance variables.
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = nextPatientID;
        nextPatientID++;
        totalPatients=totalPatients+1;
    }
    // Create a static method setHospitalName to set the hospital name.
    public boolean isPatient(Patient patient) {
        return patient instanceof Patient;
    }
    public static void setHospitalName(String name) {
        hospitalName = name;
        }
    public String toString() {
        return "Patient ID: " + patientID + "\nName: " + name + "\nAge: " + age + "\nAilment: " + ailment;
    }
    public static void main(String[] args) {
        Patient.setHospitalName("Aadhar Hospital");
        Patient patient1 = new Patient("Nikhil", 25, "Fever");
        Patient patient2 = new Patient("Sourabh", 21, "Cough");
        System.out.println(patient1);
        System.out.println("Is Patient: " + patient1.isPatient(patient1));
        System.out.println(patient2);
        System.out.println("Is Patient: " + patient2.isPatient(patient2));
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
