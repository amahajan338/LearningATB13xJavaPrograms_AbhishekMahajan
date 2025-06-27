package ex_27_task;

import java.util.Scanner;

public class divisble_5_11_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        long a = sc.nextLong();

        if (a%5 == 0 && a%11 == 0){
            System.out.println("The number is divisible by 5 & 11");
        } else if (a%5 == 0 && a%11 != 0){
            System.out.println("The number is divisible by 5 and not by 11");
        } else if (a%5 != 0 && a%11 == 0){
            System.out.println("The number is divisible by 11 & not by 5");
        } else if (a%5 !=0 && a%11 != 0){
            System.out.println("The number is not divisible by 5 & 11");
        } else {
            System.out.println("Invalid number!!!!");
        }
    }
}
