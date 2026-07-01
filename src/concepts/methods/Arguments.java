package concepts.methods;

import java.util.Scanner;

public class Arguments {

    static int x = 10;

    public static void main(String[] args) {

//        String ask = name("Ankit", "Goswami");
//        System.out.println(ask);

        System.out.println(x);

        int x = 15;
        System.out.println(x);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();

        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String name( String a , String b){
        return "How are you! " + a + " " + b;
    }
}
