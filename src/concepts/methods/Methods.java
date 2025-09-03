package concepts.methods;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Firstname of yours: ");
        String Firstname = scanner.nextLine();
        System.out.print("Enter Lastname of yours: ");
        String Lastname = scanner.nextLine();
        String Username = namePrint(Firstname, Lastname);

        System.out.print(Username);

//        int age = 20;
//        HappyBirthday(name, age);

//        int age = 12;
//
//        if(ageCheck(age)){
//            System.out.println("You are not eligible!");
//        }
//        else {
//            System.out.println("You are eligible!");
//        }

        scanner.close();

    }
    static void HappyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s\n", name);
        System.out.printf("Happy Birthday to %d year old %s\n", age, name);
        System.out.println("Happy Birthday to you");
    }
    static boolean ageCheck(int age){
        return age <=18;
    }

    static String namePrint(String Firstname, String Lastname){
        return Firstname + " " + Lastname;
    }
}
