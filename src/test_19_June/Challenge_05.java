package test_19_June;

public class Challenge_05 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        // Operator Precedence
        System.out.println("Operator Precedence:");
        int result1 = a + 2 * 3; // Multiplication has higher precedence
        System.out.println("a + 2 * 3 = " + result1 + " (2 * 3 evaluated first, then added to a)");

        int result2 = (a + 2) * 3; // Parentheses change precedence
        System.out.println("(a + 2) * 3 = " + result2 + " (a + 2 evaluated first)");

        double result3 = a / 2 + b * 2; // Division and multiplication have equal precedence, evaluated left to right
        System.out.println("a / 2 + b * 2 = " + result3 + " (a / 2 = 5, b * 2 = 7.0, then added)");

        // Type Casting
        System.out.println("\nType Casting:");

        // Implicit Casting (int to double)
        double implicitResult = a + b; // int a is automatically converted to double
        System.out.println("a + b = " + implicitResult + " (int a is implicitly cast to double)");

        // Explicit Casting (double to int)
        int explicitResult = a + (int)b; // double b is explicitly cast to int (3)
        System.out.println("a + (int)b = " + explicitResult + " (b is explicitly cast to 3)");

        // Explicit Casting (int division resulting in double)
        double castedDivision = (double)a / 3; // force floating-point division
        System.out.println("(double)a / 3 = " + castedDivision + " (a is explicitly cast to double for accurate division)");
    }
}
