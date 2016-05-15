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
        this.id = id;
        this.name = Args.notEmpty(name, "name");
        this.age = Args.notNegative(age, "age");
    }

    public Person(String name, int age) {
        this(RandomIdGenerator.generateInt(), name, age);
    }

    public Person() {
        this.id = RandomIdGenerator.generateInt();
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
        this.name = Args.notEmpty(name, "name");
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = Args.notNegative(age, "age");
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
