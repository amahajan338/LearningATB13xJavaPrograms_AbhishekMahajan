package Task_of_July.ex_9_july_task;
/*
Task 5: Catch Using Exception (Generic Catch)

Description:
Use only catch(Exception e) to catch any exception.
Throw a NullPointerException or ArithmeticException inside try.
*/

public class Try_catch_task_5 {
    public static void main(String[] args) {
            int a=0;

            try {
                a = 10/0;//java.lang.ArithmeticException

            } catch (Exception e) {

                System.out.println("Divide by Zero is not allowed");
            }

            System.out.println(a);
        }
}
