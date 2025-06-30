package ex_30_06_OOPs;

public class Person {
    //This class will be used in the lab_166_oops for reference.
    // These are called properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;


    // These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat(String food){
        System.out.println("Walking");
    }

    String sleep(){
        System.out.println("Walking");
        return null;
    }

    String food(int a){
        System.out.println("Walking");
        return null;
    }
}
