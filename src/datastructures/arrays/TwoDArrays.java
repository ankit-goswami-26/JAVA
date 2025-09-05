package datastructures.arrays;

public class TwoDArrays {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        char[][] telephone = {  {'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for(char[] numbers : telephone){
            for(char number : numbers){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
