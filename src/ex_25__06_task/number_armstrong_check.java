package ex_25__06_task;

import java.util.Scanner;

public class number_armstrong_check {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter your input");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Checking it the number is Armstrong or not (1³ + 5³ + 3³ = 153)
        int temp = number;
        int count = 0;

        // Getting the count of digits
        while (temp != 0) {
            int digits=temp%10;
            temp /= 10;
            count++;
        }

        int temp2 = number;
        int armstrongNumber = 0;
        while (temp2 != 0) {
            int digits = temp2 % 10;
            armstrongNumber = armstrongNumber+(int) Math.pow(digits, count);
            temp2 /= 10;
        }

        System.out.println("User number is: " + number);
        System.out.println("After changing new number is: "+armstrongNumber);

        if (armstrongNumber == number) {
            System.out.println("The given input is a Armstrong Number");
        } else {
            System.out.println("The given input is not a Armstrong Number");
        }
    }
}
