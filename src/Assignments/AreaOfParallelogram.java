package Assignments;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = input.nextDouble();

        System.out.print("Enter Height: ");
        double height = input.nextDouble();

        if (base < 0 || height < 0) {
            System.out.println("Values cannot be negative!");
            return;
        }

        double area = base * height;

        System.out.printf("Area of Parallelogram is: %.2f", area);

        input.close();
    }
}
