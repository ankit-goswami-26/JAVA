package Assignments;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Diagonal 1: ");
        double d1 = input.nextDouble();

        System.out.print("Enter Diagonal 2: ");
        double d2 = input.nextDouble();

        if (d1 < 0 || d2 < 0){
            System.out.println("Values cannot be negative!");
            return;
        }

        double area = (d1 * d2) / 2;

        System.out.printf("Area of Rhombus is: %.2f", area);

        input.close();
    }
}
