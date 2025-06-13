package ex_07_Increment_Decrement_Op;

public class day_13_task_all {
    public static void main(String[] args) {
//      Program 1:

        int a = 5;

        int b = a++;

        System.out.printf("Result of Program 1 :");

        System.out.println("a: " + a + ", b: " + b);



//      Program 2:
        int i = 1;

        i = i++ + ++i;

        System.out.printf("Result of Program 2 :");
        System.out.println(i);

//      Program 3:

        int x = 5;

        System.out.printf("Result of Program 3 :");
        System.out.println(x++ + ++x); // ?

//      Program 4:

        int x1 = 5;

        System.out.printf("Result of Program 4 :");
        System.out.println(++x1); // Output: ?

        System.out.println(x1++); // Output: ?

        System.out.println(x1);   // Output: ?


//      Program 5:  Interview Question

        int a1 = 5;

        int b1 = a1++ + ++a1;

//      int b1 = (5)++ + ++(6) > 6 + 6 > b1 = 12 & a = ++(6) > 7


        System.out.printf("Result of Program 5 :");
        System.out.println("a1: " + a1); // Output: ?

        System.out.println("b1: " + b1); // Output: ?



//      Program 6:  Interview Question

        /*
        Expression	Value Used	   z After
        z++	            1	          2
        ++z	            3	          3
        z++	            3	          4
        ++z	            5	          5

            Why?
            z++ → post-increment: uses the current value, then increments.

            ++z → pre-increment: increments first, then uses the new value.

        */

        int z = 5;

        int y = z++ + ++z + z++ + ++z;

        System.out.printf("Result of Program 6 :");
        System.out.println("z = " + z + ", y = " + y);
    }

}
