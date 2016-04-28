package com.bvan.javaoop.blinov.ch3.a.patient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PatientRunner {

    public static void main(String[] args) {
        List<Patient> patients = createPatients();

        List<Patient> illnessPatients = PatientUtils.findByDiagnosis(patients, "Illness");
        System.out.println("illnessPatients = " + illnessPatients);

        List<Patient> patientsByCardNumber = PatientUtils.findByMedicalCardNumber(patients, 500, 1500);
        System.out.println("patientsByCardNumber = " + patientsByCardNumber);
    }

    private static List<Patient> createPatients() {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient()
                .setName("John")
                .setSurname("Smith")
                .setAddress("John's Address")
                .setPhoneNumber("+38 (095) 111-11-11")
                .setMedicalCardNumber(1000)
                .setDiagnosis("Healthy")
        );
        patients.add(new Patient()
                .setName("Bob")
                .setSurname("Huston")
                .setAddress("Bob's Address")
                .setPhoneNumber("+38 (065) 222-22-22")
                .setMedicalCardNumber(2000)
                .setDiagnosis("Illness")
        );

        return patients;
    }
}
