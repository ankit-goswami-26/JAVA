package Assignments;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Total = 0;

        while (true){
            System.out.print("Enter an Operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.print("Enter First number: ");
                int num1 = input.nextInt();
                System.out.print("Enter Second number: ");
                int num2 = input.nextInt();

                if (op == '+'){
                    Total = num1 + num2;
                }
                if (op == '-'){
                    Total = num1 - num2;
                }
                if (op == '*'){
                    Total = num1 * num2;
                }
                if (op == '/'){
                    if(num2 > 0){
                        Total = num1 / num2;
                    }
                }
            } else if (op == 'x'|| op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator!");
            }
            System.out.println(Total);
        }

        input.close();
    }
}
