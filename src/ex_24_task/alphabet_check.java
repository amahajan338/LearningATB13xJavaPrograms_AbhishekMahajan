package ex_24_task;

import java.util.Scanner;

public class alphabet_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String input = sc.next();

        if (input.length() == 1) {
            char alphabet = input.charAt(0);
            int asci = (int) alphabet;
            if ((asci >= 65 && asci <= 90) || (asci >= 97 && asci <= 122)) {
                System.out.println(alphabet + " is an alphabet");
            } else {
                System.out.println(alphabet + " is not an alphabet");
            }
        } else {
            System.out.println("Please enter only a single character.");
        }
    }
}
