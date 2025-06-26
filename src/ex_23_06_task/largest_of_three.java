package ex_23_06_task;

import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integers from user
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        // Logic to find the largest number
        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        } else if (a >= b && a >= c) {
            if (a == b || a == c) {
                System.out.println("The largest number is " + a + " (shared with another number).");
            } else {
                System.out.println("The largest number is " + a);
            }
        } else if (b >= a && b >= c) {
            if (b == a || b == c) {
                System.out.println("The largest number is " + b + " (shared with another number).");
            } else {
                System.out.println("The largest number is " + b);
            }
        } else {
            if (c == a || c == b) {
                System.out.println("The largest number is " + c + " (shared with another number).");
            } else {
                System.out.println("The largest number is " + c);
            }
        }
    }
}
