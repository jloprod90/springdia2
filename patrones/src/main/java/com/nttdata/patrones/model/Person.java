package com.nttdata.patrones.model;

import jdk.dynalink.beans.StaticClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;


public class Person {
    private String name;
    private int age;

    public static Person person;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person getInstance(String name, int age) {
        if( person == null) {
            person = new Person(name,age);
        }
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
