package ex_27_task;

import java.util.Scanner;

public class days_to_year_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total days:");
        int a = sc.nextInt();

        int year = a/365;
        int temp = a%365;
        int month = temp/60;
        int days = temp%60;

        System.out.printf("The num %d converts to %d years, %d months, %d days",a,year,month,days);

    }
}
