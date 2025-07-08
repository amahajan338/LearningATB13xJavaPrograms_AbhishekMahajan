package Task_of_July.ex_7_july_task;

public class Abstract_vs_concrete_method {
    public static void main(String[] args) {
        Child son = new Child();
        son.show();
        son.display();
    }
}

abstract class Parent{

    abstract void show();

    void display(){
        System.out.println("This is the concrete method that is printing a message!!");

    }
}

class Child extends Parent{


    @Override
    void show() {
        System.out.println("This text is displayed from the Child class that extends Parent!!");
    }
}