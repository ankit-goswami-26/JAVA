package projects.Intermediate;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE


        // declare variables
        int balance = 100;
        int bet;
        String[] row;
        int payout;
        String playAgain;


        Scanner scanner = new Scanner(System.in);



        // display welcome message
        System.out.println("------------------------");
        System.out.println("Welcome to slot machine");
        System.out.println("symbols: 🤑 💀 🎃 🗽 🔥");
        System.out.println("------------------------");



        // play if balance > 0
        while(balance > 0){

            // show balance
            System.out.println("Current Balance: $" + balance);
            System.out.print("Enter your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();


            // verify if bet > balance
            if(bet > balance){
                System.out.println("Insufficient funds");
                continue;
            }


            // verify if bet > 0
            else if(bet <= 0){
                System.out.println("bet must be greater than 0");
                continue;
            }

            // subtract bet from balance
            else{
                balance -= bet; // argument assignment operator
            }

            // spin row
            System.out.println("spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            // get payout
            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost");
            }


            // ask to play again
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("yes")){
                break;
            }
        }


        // display exit message
        if(balance == 0){
            System.out.println("----------------------");
            System.out.println("You lost everything!");
            System.out.println("THANK YOU FOR PLAYING!");
            System.out.println("----------------------");
        }
        else{
            System.out.println("----------------------");
            System.out.println("THANK YOU FOR PLAYING!");
            System.out.println("----------------------");
        }

    }


    // spin row
    static String[] spinRow(){
        String[] symbols ={"🤑", "💀", "🎃", "🗽", "🔥" };
        String[] row = new String[3];
        Random random = new Random();
//        symbols[random.nextInt(symbols.length)];
//        symbols = row(random.nextInt(symbols.length));

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }


    // print row
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }


    // get payout
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🤑" -> bet * 300;
                case "💀" -> bet * 500;
                case "🎃" -> bet * 700;
                case "🗽" -> bet * 900;
                case "🔥" -> bet * 1300;
                default -> 0;
            };
        }

        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🤑" -> bet * 21;
                case "💀" -> bet * 41;
                case "🎃" -> bet * 61;
                case "🗽" -> bet * 101;
                case "🔥" -> bet * 161;
                default -> 0;
            };
        }

        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🤑" -> bet * 20;
                case "💀" -> bet * 40;
                case "🎃" -> bet * 60;
                case "🗽" -> bet * 80;
                case "🔥" -> bet * 120;
                default -> 0;
            };
        }

        else if(row[0].equals(row[2])){
            return switch(row[1]){
                case "🤑" -> bet * 10;
                case "💀" -> bet * 20;
                case "🎃" -> bet * 30;
                case "🗽" -> bet * 40;
                case "🔥" -> bet * 50;
                default -> 0;
            };
        }
        return 0;
    }
}


