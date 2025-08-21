public class PrintfPractice {
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags] [width] [.precise] [specifier-character]


        /*

        String name = "Tejal";
        char firstLetter = 'T';
        int age = 21;
        double weight = 65.5;
        boolean Student = true;

        System.out.printf("Her name is %s\n", name); // for String, we use small %s
        System.out.printf("Her firstLetter is %c\n", firstLetter); // for char, we use small %c
        System.out.printf("Her current age is %d\n", age); // for int %d
        System.out.printf("And she has a weight around %.1f #motiiiiiiiiiiiiiiiiiiiiiii\n", weight); // for double %f
        System.out.printf("Also she is a student %b\n", Student); // for boolean %b
        System.out.printf("%s is %d yrs old", name, age);


        // %

        double price1 = 99;
        double price2 = 100.14;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.3f\n", price2);
        System.out.printf("%.2f\n", price3);




        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative


        // [+]
        double price1 = 99;
        double price2 = 100.14;
        double price3 = -54.01;

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%+.3f\n", price2);
        System.out.printf("%.2f\n", price3);


        // [,]
        double price1 = 9000.99;
        double price2 = 100000.14;
        double price3 = -54000.01;

        System.out.printf("%,.1f\n", price1);
        System.out.printf("%,.3f\n", price2);
        System.out.printf("%,.2f\n", price3);


        // [(]
        double price1 = 99;
        double price2 = 100.14;
        double price3 = -54.01;

        System.out.printf("%(.1f\n", price1);
        System.out.printf("%(.3f\n", price2);
        System.out.printf("%(.2f\n", price3);


        // [space]
        double price1 = 99;
        double price2 = 100.14;
        double price3 = -54.01;

        System.out.printf("% .1f\n", price1);
        System.out.printf("% .3f\n", price2);
        System.out.printf("% .2f\n", price3);




        // [width]
        // 0 = zero padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 465;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);


        int id1 = 1;
        int id2 = 23;
        int id3 = 465;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

         */


        int id1 = 1;
        int id2 = 23;
        int id3 = 465;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
