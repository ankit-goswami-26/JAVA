package concepts.basics;

import java.util.Scanner;

public class CICalculator {
    public static void main(String[] args){

        //compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %):");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years); //Formula

        System.out.printf("The amount after %d years is $%.2f",years , amount);

        scanner.close();
    }
}
