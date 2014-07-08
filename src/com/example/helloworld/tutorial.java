package com.example.helloworld;

import sun.org.mozilla.javascript.internal.Function;

class Person {
    String name;
    int age;
    String persona;
    void speak() {
        System.out.println("Hello. I am " + name);

    }
    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

public class tutorial {
    public static void main(String[] args) {
        Person alex = new Person();{
            alex.name = "Alex";
            alex.age = 25;
            alex.persona = "ridiculous";
            alex.speak();
            int years = alex.calculateYearsToRetirement();

            System.out.println("I have " + years + " seconds until I explode.");
            int age = alex.getAge();
            String name=alex.getName();
            System.out.println("My name is " + name);
        }
    }
}
