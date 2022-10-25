package com.nttdata.patrones.model;

public class UserBuilder {
    private String name;

    private String surname;
    private int age;
    private String dni;

    public UserBuilder() {
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }


    public UserBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder dni(String dni) {
        this.dni = dni;
        return this;
    }

    public User build() {
        return new User(this);
    }

    // Getters

    public String getName() {
        return name;
    };

    public String getSurname() {
        return surname;
    };

    public int getAge() {
        return age;
    };

    public String getDni() {
        return dni;
    };
}
