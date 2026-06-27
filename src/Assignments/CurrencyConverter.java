package Assignments;

import java.util.Scanner;

public class CurrencyConverter {
    static final double EXCHANGE_RATE = 96.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in INR (₹): ");
        double inr = input.nextDouble();

        if (inr < 0){
            System.out.println("Amount cannot be negative!");
            return;
        }

        double usd = inr / EXCHANGE_RATE;

        System.out.printf("₹%.2f = $%.2f%n", inr, usd);

        input.close();
    }
}