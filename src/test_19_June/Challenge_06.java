package test_19_June;

import java.util.Scanner;

public class Challenge_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (a > 0) {
            System.out.println("The number is positive.");
        } else if (a < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
