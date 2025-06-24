package test_19_June;


import java.util.Scanner;

public class Challenge_08 {
    public static void main(String[] args) {
        //Program to check the given year is a leap error or not.

        Scanner scanner = new Scanner(System.in);

        //Taking the input
        System.out.println("Enter the year");

        int a = scanner.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
                System.out.println("The year " + a + " is a leap year.");
        }else {
            System.out.println("The year " + "is not a leap year");
        }
    }
}
