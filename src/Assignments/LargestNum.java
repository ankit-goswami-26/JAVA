package Assignments;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int f = input.nextInt();

        System.out.print("Enter second number: ");
        int s = input.nextInt();

        if (f > s){
            System.out.println(f + " is the largest number");
        } else {
            System.out.println(s + " is the largest number");
        }

        input.close();
    }
}
