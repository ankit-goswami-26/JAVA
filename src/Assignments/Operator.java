package Assignments;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int a = input.nextInt();

        System.out.print("Enter Operator +, -, *, /: ");
        char op = input.next().charAt(0);

        System.out.print("Enter Second number: ");
        int b = input.nextInt();

        int result = 0;

        if (op == ('+')) {
            result = a + b;
        } else if (op == ('-')) {
            result = a - b;
        } else if (op == ('*')) {
            result = a * b;
        } else if (op == ('/')) {
            if (b == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid Operator!");
            return;
        }

        System.out.println(a+ " " + op + " " + b + " = " + result);

        input.close();
    }
}
