package ex_09_Switch;

import java.util.Arrays;
import java.util.Scanner;

public class day_16_task_1 {
    public static void main(String[] args) {
        //Program to determine the type of triangle by the given length of the side of the triangle.
        //Additional to this it will also determine the angle ot the triangle.
        Scanner scanner = new Scanner(System.in);

        // Get the three sides from the user
        System.out.print("Enter side a: ");
        int a = scanner.nextInt();

        System.out.print("Enter side b: ");
        int b = scanner.nextInt();

        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        int[] sides = {a, b, c};
        Arrays.sort(sides); // Sort to get the longest side last

        int x = sides[0];
        int y = sides[1];
        int z = sides[2];

        // Check if the input can form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Side-based classification
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

            // Angle-based classification
            int x2 = x * x;
            int y2 = y * y;
            int z2 = z * z;

            if (z2 == x2 + y2) {
                System.out.println("The triangle is Right-Angled Triangle.");
            } else if (z2 < x2 + y2) {
                System.out.println("The triangle is Acute-Angled Triangle.");
            } else {
                System.out.println("The triangle is Obtuse-Angled Triangle.");
            }

        } else {
            // Only one message if triangle is invalid
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}