package ex_25__06_task;

import java.util.Scanner;

/*
Take the input from the user for

            Age (integer).

            Visa Status (String or boolean).

     Check Eligibility:

             :- If age is 18 or older and visa status is valid, the person can travel.

Otherwise, the person cannot travel.

        Validation Criteria

                Age: - Must be a non-negative integer.

                         :- Should be greater than or equal to 18 to be eligible to travel.

        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").

                               :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
*/


public class visa_status_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age. Age must be a non-negative integer.");
            return;
        }

        scanner.nextLine(); // Consume newline

        // Input visa status
        System.out.print("Enter visa status (valid/invalid): ");
        String visaStatus = scanner.nextLine().trim().toLowerCase();

        // Validate visa status
        if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status. Enter 'valid' or 'invalid'.");
            return;
        }

        // Check eligibility
        boolean isVisaValid = visaStatus.equals("valid");

        if (age >= 18 && isVisaValid) {
            System.out.println("You are eligible to travel.");
        } else {
            System.out.println("You are NOT eligible to travel.");
        }

        scanner.close();
    }
}
