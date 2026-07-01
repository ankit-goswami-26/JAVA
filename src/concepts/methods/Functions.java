package concepts.methods;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = input.nextInt();

        System.out.print("Enter second value: ");
        int b = input.nextInt();

        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int a = input.nextInt();

        System.out.print("Enter second value: ");
        int b = input.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
