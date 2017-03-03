package com.bvan.javaoop.blinov.ch3.a.patient_pure_oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Patients implements Iterable<Patient> {

    private final List<Patient> patients = new ArrayList<>();

    public void add(Patient patient) {
        patients.add(patient);
    }

    public Patients findByDiagnosis(String diagnosis) {
        Patients res = new Patients();
        for (Patient patient : patients) {
            if (Objects.equals(patient.getDiagnosis(), diagnosis)) {
                res.add(patient);
            }
        }

        return res;
    }

    public Patients findByMedicalCardNumber(int minCardNumber, int maxCardNumber) {
        Patients res = new Patients();
        for (Patient patient : patients) {
            int cardNumber = patient.getMedicalCardNumber();

            if (cardNumber >= minCardNumber && cardNumber <= maxCardNumber) {
                res.add(patient);
            }
        }

        return res;
    }

    @Override
    public Iterator<Patient> iterator() {
        return patients.iterator();
    }

    @Override
    public String toString() {
        return patients.toString();
    }
}
