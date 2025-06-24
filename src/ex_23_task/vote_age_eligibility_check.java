package ex_23_task;

import java.util.Scanner;

public class vote_age_eligibility_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Enter a valid age");
        } else if (a > 0 && a < 18) {
            System.out.println("Your are minor and not eligible to vote.");
        } else {
            System.out.println("Your are adult and eligible to vote");
        }
    }
}
