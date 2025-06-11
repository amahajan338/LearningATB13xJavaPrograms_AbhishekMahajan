package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 >30
        System.out.println(c);

        int age_modi = 23;
        int age_abhi = 34;
        boolean result = age_abhi >= age_modi;
        System.out.println(result);

        // age_abhi > age_modi or age_abhi = age_modi
    }
}
