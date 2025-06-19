package test_19_June;

public class Challenge_04 {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Initial value: " + a);

        // Post-Increment
        System.out.println("\nPost-Increment:");
        System.out.println("number++: " + (a++));  // prints 5, then number becomes 6
        System.out.println("After number++: " + a); // now 6

        // Pre-Increment
        System.out.println("\nPre-Increment:");
        System.out.println("++number: " + (++a));  // increments first (7), then prints
        System.out.println("After ++number: " + a); // still 7

        // Post-Decrement
        System.out.println("\nPost-Decrement:");
        System.out.println("number--: " + (a--));  // prints 7, then number becomes 6
        System.out.println("After number--: " + a); // now 6

        // Pre-Decrement
        System.out.println("\nPre-Decrement:");
        System.out.println("--number: " + (--a));  // decrements first (5), then prints
        System.out.println("After --number: " + a); // still 5
    }
}
