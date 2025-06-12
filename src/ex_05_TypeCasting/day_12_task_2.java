package ex_05_TypeCasting;

public class day_12_task_2 {
    public static void main(String[] args) {
        /*
        Explicit Typecasting (Narrowing)
        Description: Casts a double to an int, cutting off decimals value.
        */
//      Assigned double variable A with value 102.421
        double A = 102.421;
//      Assigned int variable B with value of A using explicit type casting.
        int B = (int)A;
//      The value will be 102
        System.out.println(B);

    }
}
