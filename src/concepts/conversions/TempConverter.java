package concepts.conversions;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        // Temperature converter

        Scanner scanner = new Scanner(System.in);

        // Variable Declaration
        double temp;
        double newTemp;
        String unit;

        // Prompt for basics.UserInput
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // variable = (condition) ? True : False; #Ternary Operator
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9 ) + 32 ;
        System.out.printf("%.1f°%s",newTemp, unit);

        scanner.close();
    }
}
