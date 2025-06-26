package ex_25__06_task;

import java.util.Scanner;

/*Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)

Basic Pay
HRA (House Rent Allowance) – 20% of Basic Pay
DA (Dearness Allowance) – 10% of Basic Pay
Tax Deduction – 12% of Gross Salary
Net Salary = Gross Salary - Tax Deduction
*/
public class salary_cal_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Basic Pay
        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        // Calculate HRA and DA
        double hra = 0.20 * basicPay;
        double da = 0.10 * basicPay;

        // Calculate Gross Salary
        double grossSalary = basicPay + hra + da;

        // Calculate Tax Deduction (12% of Gross)
        double taxDeduction = 0.12 * grossSalary;

        // Calculate Net Salary
        double netSalary = grossSalary - taxDeduction;

        // Display Results
        System.out.println("\n--- Salary Details ---");
        System.out.printf("Basic Pay: ₹%.2f\n", basicPay);
        System.out.printf("HRA (20%%): ₹%.2f\n", hra);
        System.out.printf("DA (10%%): ₹%.2f\n", da);
        System.out.printf("Gross Salary: ₹%.2f\n", grossSalary);
        System.out.printf("Tax Deduction (12%%): ₹%.2f\n", taxDeduction);
        System.out.printf("Net Salary: ₹%.2f\n", netSalary);

        scanner.close();
    }
}
