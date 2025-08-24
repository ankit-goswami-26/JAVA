package concepts.strings;

import java.util.Scanner;

public class SubstringMethod {
    public static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
        //                .substring(star, end)


        /*
        String email = "goswamiankit459@gmail.com";
        String pass = email.substring(0, 15);
        String domain = email.substring(15); // we can perform this in both ways by (15, 25)

         */


        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email:");
        email = scanner.nextLine();


        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1); // it's another way to perform using index method

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("@ symbol is missing");
        }
        scanner.close();
    }
}
