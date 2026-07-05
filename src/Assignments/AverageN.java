package Assignments;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        double n = in.nextDouble();

        if (n <= 0){
            System.out.println("Enter positive numbers!!");
            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++){
            System.out.print("Enter a number " + i + ": ");
            sum += in.nextDouble();
        }

        double avg = sum / n;

        System.out.printf("Avg = %.2f%n", avg);

        in.close();
    }
}
