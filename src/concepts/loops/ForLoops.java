package concepts.loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        // for loop = executes some code a CERTAIN amount of time

        /*

        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i++){
            System.out.println(i);
        }
        scanner.close();

        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR");

        scanner.close();
    }
}

// There are three types of statements in for loop, each separated by a Semi-colon
// 1st is used for initialization, in this we are basically declaring a variable,
// here 'i' is also known as loop controller variable
// 2ns statement is a condition (when we want to stop)
// 3rd statement is an update (we increment or decrement a variable)