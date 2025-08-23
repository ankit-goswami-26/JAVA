package operators;

public class TernaryOperator {
    public static void main(String[] args){

        //Ternary Operator ? = Return 1 or 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 20;
        int number = 20;


//        # BY USING IF STATEMENT

        /*
        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        */


//        # TERNARY OPERATOR

        /*
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);
        */

        double Grade = (number >= 40) ? 10 : 90;

        System.out.printf("%.0f%%\n" ,Grade );
    }
}
