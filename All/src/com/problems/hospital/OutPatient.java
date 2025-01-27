package src.com.problems.hospital;


// OutPatient Class extends Patient
class OutPatient extends Patient implements MedicalRecord {
    private String treatment;
    
    public OutPatient(String patientId, String name, int age, String treatment) {
        super(patientId, name, age);
        this.treatment = treatment;
    }

    @Override
    public double calculateBill() {
        return 150.00; // Fixed charge for out-patient treatment
    }

    @Override
    public void addRecord(String record) {
        System.out.println("Adding Medical Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Viewing Medical Records for " + getName());
    }

    // Encapsulation - Getting and Setting Treatment details
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
