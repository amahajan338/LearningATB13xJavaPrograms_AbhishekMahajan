package ex_04_Operators;

public class Lab044_BODMAS {
    public static void main(String[] args) {
        /*
        the brackets have to be solved first followed by
        powers or roots (i.e. of),
        Division,
        Multiplication,
        Addition,
        and at the end Subtraction.
        */

        System.out.println((9 * 3 / 9 + 1) * 3);
        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12
    }
}
