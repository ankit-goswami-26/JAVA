package oopconcepts.constructors;

public class User {

    // attributes
    String username;
    String email;
    int age;

    User(){
        this.username = "guest";
        this.email = "abc123@gmail.com";
        this.age = 0;
    }

    User(String username){
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 2;
    }

    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }


}
