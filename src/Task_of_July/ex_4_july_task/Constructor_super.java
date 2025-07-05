package Task_of_July.ex_4_july_task;

public class Constructor_super {
    public static void main(String[] args)
    {
        Car car = new Car();

    }
}

class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicale -> DC");
    }
}

class Car extends Vehicle
{
    Car()
    {
        super();
    }
}
