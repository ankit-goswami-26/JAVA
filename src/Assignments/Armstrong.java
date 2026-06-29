package Assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = input.nextInt();

        System.out.print("Enter End: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
        input.close();
    }
    static boolean isArmstrong(int num){
        int digits = String.valueOf(num).length();
        double sum = 0;
        int temp = num;

        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }
}