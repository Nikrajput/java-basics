package com.amigoscode;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Primitive data types
        Float theFloat=10.4567F;
        double number= 10.04;
        String brand = "code";

        byte theByte=-128; // -128 to 127

        long theLong= 12_34_56_78_91_234L; // we can put underscore to visualize the value better

        boolean isAdult=true; // true or false

        char nameInitial='A';

        System.out.println(theLong);


        // Reference data types
        Date date=new Date();
        System.out.println(date);


        // same class name but from different places, we have to explicitly tell the path
        java.sql.Date date2=new java.sql.Date(100);

        System.out.println(date2);

        LocalDate now=LocalDate.now();
        System.out.println(now.getYear());

        String name=new String("amigoscode");
        System.out.println(name.toUpperCase());

        System.out.println(name.equals(brand));


        String s1="Alex";
        String s2="Jamir";

        String s3= s1+s2;

        System.out.println(s3);


        Person alex = new Person("Alex");

        Person mariam=alex;

        System.out.println(alex.name + " " + mariam.name);

        alex.name="Alexander";

        System.out.println(alex.name + " " + mariam.name);

        mariam.name="Maraiam";
        System.out.println(alex.name + " " + mariam.name);

    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}