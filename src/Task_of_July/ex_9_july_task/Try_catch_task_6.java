package Task_of_July.ex_9_july_task;
/*
Task 6: Catch Specific vs Generic Exception
Description:
Try the same code twice — once using catch(Exception e) and once using catch(NullPointerException e).
Compare output and behavior.
*/

public class Try_catch_task_6 {
    public class Task_6 {
        public static void main(String[] args) {
            String name=null;
            try {

                name.trim();
            } catch (NullPointerException e) {
                System.out.println("Caught using null pointer Exception : " +  e);;
            }
            try {

                name.trim();
            } catch (Exception e) {
                System.out.println("Caught using  Generic exception "  + e);;
            }

        }
    }
}
