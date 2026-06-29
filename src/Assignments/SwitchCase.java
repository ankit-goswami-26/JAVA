package Assignments;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a fruit: ");
        String fruits = input.next().trim().toLowerCase();

        switch (fruits){
            case "apple" -> System.out.println("King of all fruits");
            case "mango" -> System.out.println("Sweetest fruit");
            case "grapes" -> System.out.println("Bunch of Green grapes");
            case "banana" -> System.out.println("Monkey's loves it");
            default -> System.out.println("Enter valid fruit!");
        }
        input.close();
    }
}
