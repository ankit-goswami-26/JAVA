import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){

        // Enhanced switch = A replacement to many else if statements
        //                    (Java 14 feature)

        // User input Method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = scanner.nextLine().toLowerCase();

        // Enhanced Switch Method
        switch (day){
            case "monday", "tuesday","wednesday","friday" -> System.out.println("Its a Weekday");
            case "saturday", "sunday" -> System.out.println("Its an Weekend");
            default -> System.out.println(day + "There's no day like that ");
        }
        scanner.close();
    }
}

// By using small case in "monday"..... and also adding a string method like ( .toLowerCase() )
// // we make our switch case-insensitive to user input. It will accept any case combination
// (e.g., "MONDAY", "Monday", "monday") and convert it to lowercase before comparison