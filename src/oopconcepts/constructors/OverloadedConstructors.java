package oopconcepts.constructors;

public class OverloadedConstructors {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists
        //                           Enable objects to be initialized in various ways

        User user1 = new User();
        User user2 = new User("Ankit");
        User user3 = new User("Ankit", "goswamiankit459@gmail.com");
        User user4 = new User("Tejal", "tejalpatil231@gmail.com", 21);


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
