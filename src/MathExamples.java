import java.util.Scanner;
public class MathExamples {
    public static void main(String[] args){

//        HYPOTENUSE
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("The Hypotenuse (side c):%.1fcm²",c );
        // For power square....
        // Windows: Numlock is on + Alt + 0178  or  Mac: Control + Command + Space

        // for power cube....
        // Windows: Numblock is on + Alt + 0179

        scanner.close();
    }
}

        /* MATH CONSTANTS
        System.out.println(Math.PI);
        System.out.println(Math.E);
        */



        /* MATH METHODS
        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        */