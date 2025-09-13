package concepts.basics;

// utility class
class MathUtil{
    static final double PIE = 3.14;

        static int square(){
            return 8 * 8;
        }
    }

public class InstanceStaticDemo {

        // instance variable
        int InstanceInt;
        boolean InstanceBoolean;
        String InstanceString;
        double InstanceDouble;
        char InstanceChar;

        // static variable
        static int StaticInt;
        static Boolean StaticBoolean;
        static String StaticString;

        public static void main(String[] args) {
        InstanceStaticDemo obj = new InstanceStaticDemo(); // object reference

        System.out.println("Instance int: " + obj.InstanceInt);
        System.out.println("Instance Boolean: " + obj.InstanceBoolean);
        System.out.println("Instance String: " + obj.InstanceString);
        System.out.println("Instance char: " + obj.InstanceChar);
        System.out.println("Instance double: " + obj.InstanceDouble + "\n");

        System.out.println("static int: " + StaticInt);
        System.out.println("static Boolean: " + StaticBoolean);
        System.out.println("static String: " + StaticString);

        System.out.println("The PIE value is: " + MathUtil.PIE);
        System.out.println("The square of 8 is: " + MathUtil.square());


        // local variable
//        int localInt;
//        System.out.println("The local int is: " + localInt);


    }
}