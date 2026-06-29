package Assignments;

public class ReverseNum {
    public static void main(String[] args) {

        int n = 28479;
        int rem;
        while(n > 0){
             rem = n % 10;
            System.out.print(rem);
            n /= 10;
        }
    }
}
