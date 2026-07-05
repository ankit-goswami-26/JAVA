package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long in = input.nextLong();

        int factorial = 1;

        for (int i = 1; i <= in; i++){
            factorial *= i;
        }

        System.out.println("Factorial is: " + factorial);
        input.close();
    }
}
