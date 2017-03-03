package com.bvan.javaoop.blinov.ch3.a.patient_pure_oop;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class Patient {

    private final int id;
    private final String name;
    private final String surname;
    private final String middleName;
    private final String address;
    private final String phoneNumber;
    private final int medicalCardNumber;
    private final String diagnosis;

    private Patient(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.middleName = builder.middleName;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.medicalCardNumber = builder.medicalCardNumber;
        this.diagnosis = builder.diagnosis;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id &&
                medicalCardNumber == patient.medicalCardNumber &&
                Objects.equals(name, patient.name) &&
                Objects.equals(surname, patient.surname) &&
                Objects.equals(middleName, patient.middleName) &&
                Objects.equals(address, patient.address) &&
                Objects.equals(phoneNumber, patient.phoneNumber) &&
                Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, address, phoneNumber, medicalCardNumber, diagnosis);
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

    public static class Builder {

        private static int nextId = 0;

        private int id = nextId++;
        private String name;
        private String surname;
        private String middleName;
        private String address;
        private String phoneNumber;
        private int medicalCardNumber;
        private String diagnosis;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder medicalCardNumber(int medicalCardNumber) {
            this.medicalCardNumber = medicalCardNumber;
            return this;
        }

        public Builder diagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }
    }
}
