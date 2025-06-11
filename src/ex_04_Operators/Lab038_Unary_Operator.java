package ex_04_Operators;

public class Lab038_Unary_Operator {
    public static void main(String[] args) {
        /*
        Unary Operator
        A unary operator is a type of operator that works with only one operand,
        unlike binary operators which require two operands
        */
        int a = +10;
//        int a = 10; optional
        int a1 = -110;
//        When '-' is added in front of the value of int it takes the value as negative.
        int result = a+a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);


        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}
