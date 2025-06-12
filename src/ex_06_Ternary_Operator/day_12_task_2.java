package ex_06_Ternary_Operator;

public class day_12_task_2 {
    public static void main(String[] args) {
        /*
        Check Even or Odd.
        Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;
        */
        int A = 19;

        String result = (A%2 == 0) ? "Even" : "Odd";

        System.out.printf("The value of A is %s",result);

        System.out.println(); //To break the response in the new line.

        A++; //Incremented the value of A
        String result_plus = (A%2 == 0) ? "Even" : "Odd";

        System.out.printf("The value of A is %s",result_plus);


    }
}
