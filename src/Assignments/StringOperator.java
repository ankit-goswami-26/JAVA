package Assignments;

import java.util.Scanner;

public class StringOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int a = input.nextInt();

        System.out.print("Enter Operator +, -, *, /: ");
        String op = input.next();

        System.out.print("Enter Second number: ");
        int b = input.nextInt();

        int result;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
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
