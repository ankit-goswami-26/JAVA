package Assignments;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter X1: ");
        double x1 = input.nextDouble();

        System.out.println("Enter X1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter X1: ");
        double x2 = input.nextDouble();

        System.out.println("Enter X1: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distance = %.2f%n", distance);

        input.close();
    }
}
