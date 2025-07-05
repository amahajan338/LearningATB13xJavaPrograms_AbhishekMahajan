package Task_of_July.ex_2_july_task;

public class animal_sound_simulator {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.meow();
        c1.makeSound();
        }
    }

class Animal {
    void makeSound(){
        System.out.println("Parent Animal");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("Child");
    }
}
