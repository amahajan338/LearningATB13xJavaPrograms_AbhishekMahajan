package ex_06_Ternary_Operator;

public class day_12_task_1 {
    public static void main(String[] args) {
        /*
        Find Max of Two Numbers using Ternary Operators.
        Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;
        */
        int A = 10;
        int B = 20;

        int max = (A>B) ? A : B;
        System.out.printf("The greater number is %d", max);
    }
}
