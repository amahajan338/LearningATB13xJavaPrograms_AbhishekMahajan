package Task_of_July.ex_4_july_task;

public class Method_Super {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.display();
    }
}

class Animal
{
    void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog  extends Animal
{
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        sound();          // Calls child class method
        super.sound();    // Calls parent class method using 'super'
    }
}
