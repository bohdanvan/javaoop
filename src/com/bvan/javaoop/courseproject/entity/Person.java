package com.bvan.javaoop.courseproject.entity;

import com.bvan.common.Args;
import com.bvan.common.RandomIdGenerator;

import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 7386683912412979589L;

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        Args.notEmpty(name, "name");
        checkAge(age);

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this(RandomIdGenerator.generateInt(), name, age);
    }

    public Person() {
        this.id = RandomIdGenerator.generateInt();
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

    public Person setName(String name) {
        Args.notEmpty(name, "name");
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        checkAge(age);
        this.age = age;
        return this;
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
