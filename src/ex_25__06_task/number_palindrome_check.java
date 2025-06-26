package ex_25__06_task;

import java.util.Scanner;

public class number_palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int orignal = sc.nextInt();
        int num = orignal;
        int rev = 0;

        while(num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10 ;
        }

        if(orignal == rev){
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
