package com.bvan.javaoop.blinov.ch3.a.patient;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Patient {

    private static int nextId = 0;

    private final int id = nextId++;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String phoneNumber;
    private int medicalCardNumber;
    private String diagnosis;

    public Patient() {
    }

    //----- Getters and Setters -----

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Patient setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Patient setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Patient setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Patient setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public Patient setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
        return this;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Patient setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return medicalCardNumber == patient.medicalCardNumber &&
                Objects.equals(name, patient.name) &&
                Objects.equals(surname, patient.surname) &&
                Objects.equals(middleName, patient.middleName) &&
                Objects.equals(address, patient.address) &&
                Objects.equals(phoneNumber, patient.phoneNumber) &&
                Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, address, phoneNumber, medicalCardNumber, diagnosis);
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", medicalCardNumber='" + medicalCardNumber + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
