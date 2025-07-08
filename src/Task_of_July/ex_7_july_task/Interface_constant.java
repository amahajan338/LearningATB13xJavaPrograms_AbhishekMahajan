package Task_of_July.ex_7_july_task;

public class Interface_constant {
    public static void main(String[] args) {
        NewCar baleno = new NewCar();
        baleno.carSpeed();
    }

}

interface SpeedLimit{

    int MAX_SPEED = 120;

}

class NewCar implements SpeedLimit{

    void carSpeed(){
        System.out.println("Max Speed is: " + MAX_SPEED);
    }

}