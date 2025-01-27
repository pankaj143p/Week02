package src.com.problems.hospital;
// InPatient Class extends Patient
class InPatient extends Patient implements MedicalRecord {
    private String diagnosis;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return 200.00 * daysAdmitted + 500.00; // Daily charge + fixed charge for in-patient care
    }

    @Override
    public void addRecord(String record) {
        System.out.println("Adding Medical Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing Medical Records for " + getName());
    }

    // Encapsulation - Getting and Setting Diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }
}
