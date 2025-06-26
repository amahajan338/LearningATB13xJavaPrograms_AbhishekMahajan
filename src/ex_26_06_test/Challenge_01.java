package ex_26_06_test;

import java.util.Scanner;

public class Challenge_01 {

    public static void main(String[] args) {
        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Example input: Hello World

        // 1. Concatenation
        String greeting = "You entered: ";
        String result = greeting + input;
        System.out.println("Concatenation Result: " + result);

        // 2. Length of the string
        int length = input.length();
        System.out.println("Length of input: " + length);

        // 3. Substring (extracting "World" from "Hello World")
        if (length >= 11) {
            String sub = input.substring(6);  // From index 6 to end
            System.out.println("Substring from index 6: " + sub);
        } else {
            System.out.println("Input too short for substring from index 6.");
        }

        // 4. Character Extraction
        if (length > 0) {
            char firstChar = input.charAt(0);
            char lastChar = input.charAt(length - 1);
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("Input is empty.");
        }
    }
}
