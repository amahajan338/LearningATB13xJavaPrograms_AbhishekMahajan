package ex_25__06_task;

import java.util.Scanner;

/*
 Calculate Bonus Based on Salary and Years of Experience.

          :- take the salary and Year info from the User.

Implement Bonus Calculation Logic:

     Define the bonus structure based on salary and years of experience.

           :- If years of experience is less than 1 year: No bonus.

           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.

           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.

           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
 */

public class bonus_check {
    public static void main(String[] args) {
        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("Please enter the num of years of experience");
        double experience = scanner.nextDouble();


        // Validating the bonus based on experience and salary
        if (experience < 1) {
            System.out.println("You are not eligible for a bonus for this year");
        } else if (experience>=1&&experience<=3) {
            System.out.println("Your bonus is 5% of your salary");
            double bonus = ((double) 5 / 100) * salary;
            System.out.println("New salary after bonus is: "+(bonus+salary));
        } else if (experience >= 4 && experience <= 6) {
            System.out.println("Your bonus is 10% of your salary");
            double bonus = ((double) 10 / 100) * salary;
            System.out.println("New salary after bonus is: "+(bonus+salary));
        } else if (experience > 6) {
            System.out.println("Your bonus is 15% of your salary");
            double bonus = ((double) 15 / 100) * salary;
            System.out.println("New salary after bonus is: " + (bonus + salary));
        } else {
            System.out.println("You entered a invalid input");
        }
    }
}
