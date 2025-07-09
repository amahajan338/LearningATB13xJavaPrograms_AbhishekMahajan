package Task_of_July.ex_9_july_task;

/*
Task 4: Nested Try-Catch

📘 Description:
Write a program with a try-catch block inside another try-catch block.
Example: Outer block for ArithmeticException, inner for ArrayIndexOutOfBoundsException.
*/

public class Try_catch_task_4 {
    public static void main(String[] args) {
        //Nested Try Catch Method
        try {
            System.out.println("Outer try block starts");

            try {
                System.out.println("Inner try block starts");

                // This will throw ArithmeticException
                int result = 10 / 0;

                System.out.println("Inner try block ends"); // Won't execute

            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: " + e.getMessage());
            }

            // This will throw NullPointerException
            String str = null;
            System.out.println(str.length());

            System.out.println("Outer try block ends"); // Won't execute

        } catch (NullPointerException e) {
            System.out.println("Caught in outer catch: " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch.");
    }
}
