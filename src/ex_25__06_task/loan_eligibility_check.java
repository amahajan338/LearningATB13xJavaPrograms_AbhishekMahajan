package ex_25__06_task;

import java.util.Scanner;

/*
Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)

    * Take the below User info and store it into the variables:

              Age (integer)

              Salary (double or float)

              Credit Score (integer)



    Age Validation:

              :- Check if the age is a positive integer.

              :- Ensure the age is at least 18 years old.

              :- Max age can be 80.



    Salary Validation:

             :- Check if the salary is a positive number.

             :- Define a minimum salary threshold (e.g., 30,000).

    Credit Score Validation:

             :- Check if the credit score is a positive integer.

             :- Define a minimum credit score threshold (e.g., 650).

             :- Max credit score threshold (e.g., 850).
 */

public class loan_eligibility_check {
    public static void main(String[] args) {
        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        System.out.println("Please enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Please enter you credit score");
        int creditScore = scanner.nextInt();

        // Validations

        if (age > 0 && age >= 18 && age <= 80) {
            if (salary > 0 && salary >= 30_000) {
                if (creditScore > 0 && creditScore >= 650 && creditScore <= 850) {
                    System.out.println("Congratulations, you are eligible for a Loan");
                } else {
                    System.out.println("Your credit score is not enough for loan approval");
                }
            } else {
                System.out.println("Your Salary is too low to acquire a loan");
            }
        } else {
            System.out.println("Due to your age, you are not eligible for a loan");
        }
    }
}
