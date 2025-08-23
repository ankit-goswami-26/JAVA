package miniprojects;

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){


        //MAD LIBS GAME
        Scanner scanner = new Scanner (System.in);


        String adjective1;
        String noun1;
        String adjective2;
        String verb;
        String adjective3;


        System.out.println("Enter an adjective1 ( description ): ");
        adjective1 = scanner.nextLine(); // AFTER DECLARING THIS IS THE WAY TO ASSIGN IT
        System.out.println("Enter a noun1 ( name or animal ): ");
        noun1= scanner.nextLine();
        System.out.println("Enter an adjective2 ( description ): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing ( action ): ");
        verb = scanner.nextLine();
        System.out.println("Enter an adjective3 ( description ): ");
        adjective3 = scanner.nextLine();


        System.out.println("\n\nToday i went to a " + adjective1 + " near allay, ");
        System.out.println("And i found " + noun1 + " as a shopkeeper, ");
        System.out.println("He was " + adjective2 + " from his life, ");
        System.out.println("Also he was " + verb + " in the corner, regretting!! ");
        System.out.println("I hope he wasn't " + adjective3 + " to much. ");

        scanner.close();

    }
}