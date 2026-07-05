package Assignments;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int unit = in.nextInt();

        if (unit < 0){
            System.out.println("Units cannot be negative!");
            return;
        }

        double bill = 0;

        if (unit < 100){
            bill = unit * 1.50;
        } else if (unit < 200) {
            bill = 100 * 1.50 + (unit - 100) * 2.50;
        } else if (unit < 300) {
            bill = 100 * 1.50 + 100 * 2.50 + (unit - 200) * 4.00;
        } else {
            bill = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (unit - 300) * 5.00;
        }

        System.out.printf("Electricity Bill = %.2f%n", bill);

        in.close();
    }
}
