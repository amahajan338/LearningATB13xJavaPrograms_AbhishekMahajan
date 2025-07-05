package Task_of_July.ex_4_july_task;

public class Variable_super {
    public static void main(String[] args)
    {
        Dog_1 d = new Dog_1();
        d.displayNames();
    }
}

class Animal_1
{
    String name = "Generic Animal";
}

class Dog_1 extends Animal_1
{
    String name = "Dog";

    void displayNames() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name);
    }
}
