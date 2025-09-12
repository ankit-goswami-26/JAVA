package oopconcepts;

public class Car {

    // Attributes
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    boolean isRunning = false;

    // Methods
    void start(){
        isRunning = true;
        System.out.println("YOU STARTED THE ENGINE");
    }

    void stop(){
        isRunning = false;
        System.out.println("YOU STOP THE ENGINE");
    }

    void drive(){
        System.out.println("YOU DRIVE THE " + model);
    }

    void brake(){
        System.out.println("YOU BRAKE THE " + model);
    }
}

// an object is an entity that holds data it has attributes #they have things,
// and they can perform actions (methods) #they can do things.