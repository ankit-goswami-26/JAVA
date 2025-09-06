package projects.Intermediate;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        // variable declaration
        String[] game = {"rock", "paper", "scissors"};
        String choice;
        String playAgain;
        String computerChoice;


        // display game name
        System.out.println("---------------------------------");
        System.out.println("Welcome to RockPaperScissors Game");
        System.out.println("---------------------------------");

        do{

            while(true){
                // take user input to make a move
                System.out.print("Make a move (rock , paper, scissors): ");
                choice = scanner.nextLine().toLowerCase();

                if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
                    break;
                }
                System.out.println("Invalid choice! kindly choose (rock, paper, scissors");
            }


        // random computer's move
        computerChoice = game[random.nextInt(game.length)];
        System.out.println("Computer makes a move: " + computerChoice);


        // decide winner
        if(choice.equals(computerChoice)){
            System.out.println("its a tie");
        }
        else if(isUseWinner(choice,computerChoice )){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }


            // ask to play again
            while(true){
                System.out.print("want to play again? (yes/no): ");
                playAgain = scanner.nextLine();

                // goodbye message
                if(playAgain.equals("no")){
                    System.out.println("--------------------------------");
                    System.out.println("Thank you for playing this game!");
                    System.out.println("comeback soon!");
                    System.out.println("--------------------------------");
                    break;
                }
                else if(playAgain.equals("yes")){
                    break;
                }
                System.out.println("Invalid choice! kindly select (yes/no)");
            }

        }while(playAgain.equals("yes"));
        scanner.close();
    }

    // Checks if the user wins against the computer
    static boolean isUseWinner(String choice, String computerChoice){
        return(((choice.equals("rock") && computerChoice.equals("scissors"))
                || (choice.equals("paper") && computerChoice.equals("rock"))
                || choice.equals("scissors") && computerChoice.equals("paper")));
    }
}


//Use [] when you’re accessing elements of an array.
//Use () when you’re calling a method.


