package Task_of_July.ex_9_july_task;

/*
Task 10: Try With Multiple Statements
Description:
Write multiple statements in a try block.
Ensure if the first fails, the rest are not executed, and control goes to catch.*//**/

public class Try_catch_task_10 {
    public static void main(String[] args) {
        try {
            System.out.println("Statement 1: Before exception");

            int result = 10 / 0; // Throws ArithmeticException
                //Next line will not execute it will be skipped.
            System.out.println("Statement 2: This won't execute");
            String str = null;
            System.out.println("Length: " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Always runs");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
