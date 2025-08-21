public class PrintfPractice {
    public static void main(String[] args){
        String name = "Tejal";
        char firstLetter = 'T';
        int age = 21;
        double weight = 65.5;
        boolean Student = true;

        System.out.printf("Her name is %s\n", name); // for String, we use small %s
        System.out.printf("Her firstLetter is %c\n", firstLetter); // for char, we use small %c
        System.out.printf("Her current age is %d\n", age); // for int %d
        System.out.printf("And she has a weight around %.1f #motiiiiiiiiiiiiiiiiiiiiiii\n", weight); // for double %f
        System.out.printf("Also she is a student %b", Student); // for boolean %b
    }
}
