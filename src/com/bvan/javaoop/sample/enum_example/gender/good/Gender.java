package com.bvan.javaoop.sample.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE(0, "This is a male"),
    FEMALE(1, "This is a female"),
    UNDEFINED(2, "");

    private final int number;
    private final String description;

    public static Gender byNumber(int number) {
        for (Gender gender : Gender.values()) {
            if (gender.number == number) {
                return gender;
            }
        }
        throw new IllegalArgumentException("illegal gender number: " + number);
    }

    Gender(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public char getGenderLetter() {
        return name().charAt(0);
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
