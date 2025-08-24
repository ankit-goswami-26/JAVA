package concepts.practice;/* import java.util.Scanner;

public class concepts.practice{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int Age;
        String Name;
        char Grade;

        System.out.println("Enter your age:");
        Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name:");
        Name = scanner.nextLine();
        System.out.println("Enter your grade:");
        Grade = scanner.next().charAt(0);



        System.out.println("Your given age is: " + Age);
        System.out.println("Your given age is: " + Name);
        System.out.println("Your given age is: " + Grade);

        scanner.close();
    }
}

*/




/* public class concepts.practice{
    public static void main(String[] args){

        String day = "Tuesday";
        String result = " ";

        result = switch(day)
        {
            case "Monday" -> "10am";
            case "Saturday", "Sunday" -> "9am";
            default -> "2am";
        };
        System.out.println(result);
    }
}


 */






public class PracticeExamples {
    public static void main(String[] args ){

        int age = 20;
        int result = age;

        result = switch(age){
            case 10 -> 100;
            case 20 -> 200;
            default -> 300;
        };

        System.out.println(result);

    }
}

































