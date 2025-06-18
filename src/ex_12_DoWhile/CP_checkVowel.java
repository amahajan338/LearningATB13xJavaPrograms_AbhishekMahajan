package ex_12_DoWhile;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);


        if (!Character.isLetter(ch)) { //To verify the value is character or not we are using java class Character with method isLetter.
            System.out.println("Invalid input. Please enter an alphabet character.");
        } else {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }
    }
}
