package com.pluralsight.streams;

import java.util.List;

public class Person {
    String firstName, lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person searchByName (String name, List<Person> people) {
        for (Person p : people) {
            if (p.lastName.contains(name) || p.firstName.contains(name)) {
                return p;
            }
        }
        return null;
    }
    public String string() {
        return "Person{" + "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                '}';
    }
}
