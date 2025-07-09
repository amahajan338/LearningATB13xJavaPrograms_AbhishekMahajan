package Task_of_July.ex_9_july_task;

/*Task 2: Try-Catch with Multiple Catch Blocks

📘 Description:
Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them with multiple catch blocks.

🧤 Expected Output:
Print which exception occurred.

*/

public class Try_catch_task_2 {
    public static void main(String[] args) {
        String User_Input = null;// java.lang.ArrayIndexOutOfBoundsException
        try {
            User_Input = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            ;
        }
        int a = 0;// java.lang.NumberFormatException
        try {
            a = Integer.parseInt(User_Input);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        try {
            int output = 100 / a;// java.lang.ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
