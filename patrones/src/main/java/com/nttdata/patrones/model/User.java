package com.nttdata.patrones.model;

public class User {
    private String name;
    private String surname;
    private int age;
    private String dni;

    private User() {
    }

    User(UserBuilder builder) {

        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.age = builder.getAge();
        this.dni = builder.getDni();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                '}';
    }
}
