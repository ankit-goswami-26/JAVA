package datastructures.arrays;
import java.util.Arrays;
public class ArraysBasics {
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruit = {"apple", "banana", "orange", "coconut"};

//        fruit[3] = "Ankit";

//        int numOfFruits = fruit.length;

//        for(int i = 0; i < fruit.length; i++){
//            System.out.print(fruit[i] + " ");
//        }

//        Arrays.sort(fruit);

        Arrays.fill(fruit, "pineapples");

        for(String fruits : fruit){
            System.out.println(fruits);
        }

    }
}
