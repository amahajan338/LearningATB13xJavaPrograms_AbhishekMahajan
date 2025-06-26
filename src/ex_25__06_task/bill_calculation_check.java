package ex_25__06_task;

/*
    Electricity Bill Calculation (Based on Units Consumed)

           :- take the input from the user of Units.

    Implement Rate Structure:

    Define the rate structure for calculating the bill based on the number of units consumed.

            :-  First 100 units: 0.50Rs per unit

            :-  Next 100 units (101-200): 0.75Rs per unit

            :- Next 100 units (201-300): 1.20Rs per unit

            :- Above 300 units: 1.50Rs per unit
     */

import java.util.Scanner;

public class bill_calculation_check {
    public static void main(String[] args) {
        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your units");
        int units = scanner.nextInt();

        // Validating the conditions
        if (units > 0 && units <= 100) {
            double cost = units * 0.50;
            System.out.printf("Your bill for %d units is: %f\n", units, cost);
        } else if (units > 101 && units <= 200) {
            double cost = units * 0.75;
            System.out.printf("Your bill for %d units is: %f\n", units, cost);
        } else if (units > 201 && units <= 300) {
            double cost = units * 1.20;
            System.out.printf("Your bill for %d units is: %f\n", units, cost);
        } else if (units > 300) {
            double cost = units * 1.50;
            System.out.printf("Your bill for %d units is: %f\n", units, cost);
        } else {
            System.out.println("Please enter valid units count");
        }
    }
}
