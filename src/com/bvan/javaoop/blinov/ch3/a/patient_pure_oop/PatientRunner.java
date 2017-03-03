package com.bvan.javaoop.blinov.ch3.a.patient_pure_oop;

/**
 * @author bvanchuhov
 */
public class PatientRunner {

    public static void main(String[] args) {
        Patients patients = createPatients();

        Patients illPatients = patients.findByDiagnosis("Illness");
        System.out.println("Ill patients: " + illPatients);

        Patients patientsByCardNumber = patients.findByMedicalCardNumber(500, 1500);
        System.out.println("Patients by card number: " + patientsByCardNumber);
    }

    private static Patients createPatients() {
        Patients patients = new Patients();

        patients.add(new Patient.Builder()
                .name("John")
                .surname("Smith")
                .address("John's Address")
                .phoneNumber("+38 (095) 111-11-11")
                .medicalCardNumber(1000)
                .diagnosis("Healthy")
                .build()
        );
        patients.add(new Patient.Builder()
                .name("Bob")
                .surname("Huston")
                .address("Bob's Address")
                .phoneNumber("+38 (065) 222-22-22")
                .medicalCardNumber(2000)
                .diagnosis("Illness")
                .build()
        );

        return patients;
    }
}
