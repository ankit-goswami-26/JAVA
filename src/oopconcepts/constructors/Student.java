package oopconcepts.constructors;

public class Student {

    // attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructor
    Student(String name, int age, double gpa){
        this.name = name; // this refers to the object we are currently working with.
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // methods
    void study(){
        System.out.println(this.name + " is studying.");
    }

    void avoid(){
        System.out.println(this.name + " is not studying.");
    }
}