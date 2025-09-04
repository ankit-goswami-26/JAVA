package datastructures.arrays;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] foods = {"burger", "pizza", "fries"};
        String target;
        boolean isFound = false;

        System.out.print("Which food index you wanna know?: ");
        target = scanner.nextLine();

        for(int i = 0; i < foods.length; i++){
            if(foods[i].equals(target)){
                System.out.println("The Index is:" + i );
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("INVALID FOOD!");
        }

//        for(String food : foods){
//            System.out.println(food);
//        }

        scanner.close();
    }
}

// our main motive is to find the index when a user search a food