package Assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = input.nextDouble();

        System.out.print("Enter Height: ");
        double height = input.nextDouble();

        if (base < 0 || height < 0){
            System.out.println("Input cannot be negative: ");
            input.close();
            return;
        }

        double area = 0.5 * base * height;

        System.out.printf("Area of Triangle is: %.2f", area);

        input.close();
    }
}
