package com.bvan.javaoop.sample.common;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
public class Person {

    private static int nextInt = 0;

    protected int id = nextInt++;
    protected String name;
    protected int age;

    public Person() {
    }

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
