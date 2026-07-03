package Assignments;

import java.util.Scanner;

public class Until_Zero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.print("Enter number (0 to stop): ");
        int num = input.nextInt();

        while(num != 0){
            sum += num;
            num = input.nextInt();
        }

        System.out.println("The sum is: " + sum);

        input.close();
    }
}
