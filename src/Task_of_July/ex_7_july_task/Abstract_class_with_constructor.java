package Task_of_July.ex_7_july_task;

public class Abstract_class_with_constructor {
    public static void main(String[] args) {
        // Create object of subclass
        ConcreteClass obj = new ConcreteClass();

        // Call method from abstract class
        obj.showMessage();
    }
}

// Abstract class with constructor
abstract class AbstractExample {

    // Constructor of abstract class
    AbstractExample() {
        System.out.println("Abstract class constructor called");
    }

    // Concrete method in abstract class
    void showMessage() {
        System.out.println("Method from abstract class");
    }
}

// Concrete subclass that extends abstract class
class ConcreteClass extends AbstractExample {
    // No additional code needed unless you want to override or add methods
}
