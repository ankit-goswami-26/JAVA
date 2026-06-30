package Assignments;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter equal sides (a): ");
        double a = input.nextDouble();

        System.out.print("Enter base (b): ");
        double b = input.nextDouble();

        if (a < 0 || b < 0){
            System.out.println("Values cannot be negative: ");
            return;
        }

        double area = (b / 4) * Math.sqrt(4 * a * a - b * b);

        System.out.printf("Area of Isosceles triangle is: %.2f", area);

        input.close();
    }
}
