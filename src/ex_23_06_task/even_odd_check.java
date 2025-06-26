package ex_23_06_task;

import java.util.Scanner;

public class even_odd_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value");
        int a = scanner.nextInt();

        if (a == 0){
            System.out.println("The value is zero");
        }else if (a%2 == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }
}
