package ex_23_06_task;

import java.util.Scanner;

public class min_of_two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        long a = scanner.nextLong();

        System.out.println("Enter the second number");
        long b = scanner.nextLong();

        if (a < b){
            System.out.println(a + " is smaller then " + b);
        } else if(a == b){
            System.out.println(a + " is equal too " + b);
        } else {
            System.out.println(b + " is smaller then " + a);
        }
    }
}
