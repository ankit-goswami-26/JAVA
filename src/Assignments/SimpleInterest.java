package Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = input.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = input.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = input.nextDouble();

        double si = (p * t * r) / 100;

        System.out.println("Simple Interest= " + si);

        input.close();
    }
}
