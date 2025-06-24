package ex_23_task;

import java.util.Scanner;

public class vowel_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if ( ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' || ch == 'u') {
            System.out.println("The character " + ch + " is vowel.");
        } else if (ch > 'a' && ch <= 'z') {
            System.out.println("The character " + ch + " is consonant.");
        } else {
            System.out.println("The character " + ch + " is invalid");
        }

    }
}
