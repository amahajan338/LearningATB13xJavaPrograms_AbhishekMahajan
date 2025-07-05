package Task_of_July.ex_2_july_task;

public class vehicle_constructor_chain {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }
}

class Vehicle {
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle {

    Bike() {
        System.out.println("Bike is ready");
    }
}
