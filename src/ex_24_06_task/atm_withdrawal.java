package ex_24_06_task;

import java.util.Scanner;

public class atm_withdrawal {
    public static void main(String[] args) {
        //Initial account balance of the user
        int account_bal = 10000; //Inital balance is set.
        int remaining_bal;

        //Enter the amount to withdraw
        System.out.println("Enter the amount to withdraw in multiples of 100: ");
        Scanner sc = new Scanner(System.in);
        int withdraw_amount = sc.nextInt();

        if(withdraw_amount<=0){
            System.out.println("!!Invalid amount");
            return;
        }
        else if(withdraw_amount>account_bal) {
            System.out.println("!!Insufficient balance");
            return;
        }
        else if(withdraw_amount%100 != 0){
            System.out.println("!!Please enter the amount in multiples of 100");
            return;
        }
        else{
            remaining_bal = account_bal - withdraw_amount;
            System.out.println("!! Withdraw Successful");
            System.out.println("Remaining Balance is: "+ remaining_bal);

        }
    }
}
