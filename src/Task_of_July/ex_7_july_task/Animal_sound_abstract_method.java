package Task_of_July.ex_7_july_task;

import javax.crypto.spec.PSource;

public class Animal_sound_abstract_method {
    public static void main(String[] args) {
        Dog tuff = new Dog();
        tuff.makeSound();

        Cat tom = new Cat();
        tom.makeSound();
    }
}

//Abstract class of Animal
abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Woof Woof!!!!");
    }
}

class Cat extends Animal{

    @Override
    void makeSound(){
        System.out.println("Meow Meow!!!");
    }
}