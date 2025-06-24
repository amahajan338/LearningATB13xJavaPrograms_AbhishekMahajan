package ex_23_task;

import java.util.Scanner;

public class positive_negative_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("The number is zero and no value");
        } else if (a > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
