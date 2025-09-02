package concepts.loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*

        String name = "";

        while (name.isEmpty()){
            System.out.print("Enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.print("you have quit the game!");

        */

        int age = 0;

        do{
            System.out.println("Your age cant be negative: ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("You are " + age + " years old");
        scanner.close();


    }
}
