// iF STATEMENT =  PERFORMS A BLOCK OF CODE IF ITS CONDITION IS TRUE
import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args){
        //if statement = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.print("Enter your age:");
        age = scanner.nextInt();

        System.out.print("Are you a student (yes/no):");
        String StudentInput = scanner.next().toLowerCase();
        isStudent = StudentInput.equals("yes");


//        System.out.print("Are you a student (true/false):");
//        isStudent = scanner.nextBoolean();


        //BLOCK 1

        if(name.isEmpty()){
            System.out.println("You didn't worte your name!");
        }
        else{
            System.out.println("Your name is " + name);
        }


        //BLOCK 2

        if(age >= 65){
            System.out.println("You are a senior citizen");
        }
        else if(age >=18){
            System.out.println("You are an adult!");
        }
        else if (age <0) {
            System.out.println("You haven't been born yet!");
        }
        else if(age ==0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        //BLOCK 3

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}
