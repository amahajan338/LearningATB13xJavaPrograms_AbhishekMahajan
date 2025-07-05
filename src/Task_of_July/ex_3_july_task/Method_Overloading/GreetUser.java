package Task_of_July.ex_3_july_task.Method_Overloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet());
        g1.greet("Lipi");
    }
}

class Greeter {

    String greet() {
        return "Hello!";
    }

    String greet(String name) {
        System.out.println("Hello, " +name+ " !");
        return name;
    }
}
