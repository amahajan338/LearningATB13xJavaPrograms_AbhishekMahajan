package Task_of_July.ex_9_july_task;

/*
Task 3: Try-Catch-Finally

📘 Description:
Create a program with a try, a catch, and a finally block.
Demonstrate that the finally block always executes.
 */

public class Try_catch_task_3 {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        try {
            result = num / 0;//throws an arthimetic exception
        } catch (ArithmeticException e) {
            System.out.println("Arthimetic Exception is caught");
        } finally {
            System.out.println("Finally block executed: Cleaning up resources or finishing tasks.");

        }
    }
}
