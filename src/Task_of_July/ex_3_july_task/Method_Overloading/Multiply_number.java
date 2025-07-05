package Task_of_July.ex_3_july_task.Method_Overloading;

public class Multiply_number {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println(m1.multiply(23,67));
        System.out.println(m1.multiply(67,98,56));
    }
}

class MathOperations {

    int multiply (int a, int b) {
        System.out.println("Sum of 2 Nos:");
        return a + b;
    }

    int multiply (int a, int b, int c) {
        System.out.println("Sum of 3 Nos:");
        return a + b + c;
    }
}
