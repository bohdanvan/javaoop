package com.bvan.javaoop.blinov.ch3.a.patient;

import com.bvan.common.Args;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public final class PatientUtils {

    private PatientUtils() {
    }

    public static List<Patient> findByDiagnosis(List<Patient> patients, String diagnosis) {
        Args.notNull(patients, "patients");

        List<Patient> resultPatients = new ArrayList<>();
        for (Patient patient : patients) {
            if (Objects.equals(patient.getDiagnosis(), diagnosis)) {
                resultPatients.add(patient);
            }
        }

        return resultPatients;
    }

    public static List<Patient> findByMedicalCardNumber(List<Patient> patients, int minCardNumber, int maxCardNumber) {
        Args.notNull(patients, "patients");

        List<Patient> resultPatients = new ArrayList<>();
        for (Patient patient : patients) {
            int cardNumber = patient.getMedicalCardNumber();

            if (cardNumber >= minCardNumber && cardNumber <= maxCardNumber) {
                resultPatients.add(patient);
            }
        }

        return resultPatients;
    }
}
