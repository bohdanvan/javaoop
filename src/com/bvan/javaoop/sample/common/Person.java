package com.bvan.javaoop.sample.common;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
public final class Person {

    private static int nextInt = 0;

    private int id = nextInt++;
    private String name;
    private int age;

    public Person(String name, int age) {
        Args.notEmpty(name, "name");
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("Illegal age: " + age);
        }
    }

    private boolean isAge(int age) {
        return age > 0 && age <= 120;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
