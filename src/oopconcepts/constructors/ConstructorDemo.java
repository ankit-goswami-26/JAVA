package oopconcepts.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial value

        // objects
        Student student1 = new Student("Ankit", 21, 1.5);
        Student student2 = new Student("Tejal", 22, 3.5);

//        System.out.println("Name = " + student1.name);
//        System.out.println("Age = " + student1.age);
//        System.out.println("GPA = " + student1.gpa);
//        System.out.println("isEnrolled = " + student1.isEnrolled + "\n");

//        System.out.println("Name = " + student2.name);
//        System.out.println("Age = " + student2.age);
//        System.out.println("GPA = " + student2.gpa);
//        System.out.println("isEnrolled = " + student2.isEnrolled);

        // calling method using dot operator
        student1.study(); // object1.method();
        student2.avoid();
    }
}