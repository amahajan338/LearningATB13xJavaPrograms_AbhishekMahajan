package Task_of_July.ex_3_july_task.Method_Overriding;

public class Vehicle_Start {
    public static void main(String[] args) {
        //Vehicle start sound
        Vehicle v1 = new Vehicle();
        v1.start();

        //Bike start sound override vehicles
        Bike b1 = new Bike();
        b1.start();

        //Car start sound override vehicles
        Car c1 = new Car();
        c1.start();

        //Dynamic method dispatch
        Vehicle a1 = new Car();
        a1.start();
    }
}

class Vehicle {
    void start() {
        System.out.println("Default Start!!!");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}
