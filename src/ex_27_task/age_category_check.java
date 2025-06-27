package ex_27_task;

import java.util.Scanner;

public class age_category_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age:");
        int a = sc.nextInt();

        if (a>=0 && a<18){
            System.out.println("Child");
        } else if (a>=13 && a<19){
            System.out.println("Teenage");
        } else if (a>=19 && a<64) {
            System.out.println("Adult");
        } else if (a>=64){
            System.out.println("Senior");
        } else {
            System.out.println("Invalid");
        }

    }
}
