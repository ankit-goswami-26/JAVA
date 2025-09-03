package concepts.basics;

public class VariableScope {

    static int x = 3; // CLASS

    public static void main(String[] args){

        // variable scope = where a variable can be accessed
        // there are two types #LOCAL #CLASS
        // Inside a method if you declare a variable it is considered a Local Scope
        // Inside a class if you declare a variable it is considered a Class Scope

//        int x = 1; // LOCAL
        doSomething();

    }
    static void doSomething(){
//        int x = 2; // LOCAL
        System.out.println(x);
    }
}
