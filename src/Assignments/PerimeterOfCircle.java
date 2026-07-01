package Assignments;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = input.nextDouble();

        if (r < 0){
            System.out.println("Values cannot be negative!");
            return;
        }

        double perimeter = 2 * Math.PI * r;

        System.out.printf("Perimeter of Circle is: %.2f", perimeter);

        input.close();
    }
}
