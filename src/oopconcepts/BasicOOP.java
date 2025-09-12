package oopconcepts;

public class BasicOOP {
    public static void main(String[] args) {

        // object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year + "\n");

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);

        car1.stop();
        System.out.println(car1.isRunning + "\n");

        car1.drive();
        car1.brake();
        System.out.println("\n");

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

    }
}
