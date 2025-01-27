package src.com.problems.hospital;
// Main class to demonstrate Hospital Patient Management System
public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        // Creating instances of patients
        Patient inPatient = new InPatient("P101", "Kartik", 30, "Pneumonia", 5);
        Patient outPatient = new OutPatient("P102", "Bahadur", 45, "Consultation");

        // List of patients
        Patient[] patients = {inPatient, outPatient};

        // Processing each patient for billing and records
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            // Using polymorphism to access medical records functionality
            if (patient instanceof MedicalRecord) {
                MedicalRecord recordPatient = (MedicalRecord) patient;
                recordPatient.addRecord("Diagnosis added for " + patient.getName());
                recordPatient.viewRecords();
            }
            System.out.println("---------------------------------");
        }
    }
}

