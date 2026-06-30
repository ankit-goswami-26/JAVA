package Assignments;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        if (length < 0 || width < 0){
            System.out.println("Values cannot be negative: ");
            input.close();
            return;
        }

        double area = length * width;

        System.out.printf("Area of rectangle is: %.2f", area);

        input.close();
    }
}
