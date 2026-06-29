package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci series: ");
        int n = input.nextInt();

        if (n <= 0){
            System.out.println("Number must be positive");
            return;
        }

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        input.close();
    }
}




// Using While loop

//public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    System.out.print("Enter the number of Fibonacci series: ");
//    int n = input.nextInt();
//
//    if (n <= 0){
//        System.out.println("Number must be positive");
//        return;
//    }
//
//    int a = 0, b = 1;
//    int count = 2;
//
//    while (count <= n){
//        int temp = a + b;
//        a = b;
//        b= temp;
//        count++;
//    }
//
//    System.out.println(b);
//
//    input.close();
//}