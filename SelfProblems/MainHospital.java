package SelfProblems;
import java.util.ArrayList;
import java.util.List;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void talkTo(Patient p) {
        System.out.println(name + " is talking to " + p.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void talkTo(Doctor d) {
        System.out.println(name + " is talking to " + d.name);
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void startTalk() {
        for (Doctor d : doctors) {
            for (Patient p : patients) {
                d.talkTo(p);
                p.talkTo(d);
            }
        }
    }
}

public class MainHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Doc1");
        Doctor doctor2 = new Doctor("Dr. Doc2");

        Patient patient1 = new Patient("Patient1");
        Patient patient2 = new Patient("Patient2");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.startTalk();
    }
}
