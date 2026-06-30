package Assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        if(radius <0){
            System.out.println("Radius cannot be negative!");
            return;
        }

        double area = Math.PI * radius * radius;

        System.out.printf("Area of circle is: %.2f", area);

        input.close();
    }
}
