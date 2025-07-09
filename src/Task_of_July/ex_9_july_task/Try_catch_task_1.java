package Task_of_July.ex_9_july_task;

/*Task 1: Basic Try-Catch with ArithmeticException

📘 Description:
Divide a number by zero and handle the exception.

🧤 Expected Output:
Catch ArithmeticException and print a friendly message.

*/

public class Try_catch_task_1 {
    public static void main(String[] args) {
        int a = 10;

        try {
            a = 10/0;//java.lang.ArithmeticException
        } catch (Exception e) {
            System.out.println("Divide by Zero not allowed");;
        }
        System.out.println(a);
    }
}
