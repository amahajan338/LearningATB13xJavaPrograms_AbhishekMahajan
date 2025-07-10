package Task_of_July.ex_10_july_task;

public class Generic_method {
    public static void main(String[] args) {
        display(10,40);
        //Below statement will not be printed and will throw an error. Explanation at line 17
        // display("sri","latha");
        //display(40.9,70.0);

        //Generic
        display(10,40);
        display("sri","latha");
        display(40.9,70.0);

    }
    //Below method will not be able to give result for all datatype other than int.
    static void display(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    //This is the Generics which it supports the all datatypes with one function.
    static <T> void display(T a, T b){
        //now this allows us to add any data type
        System.out.println(a);
        System.out.println(b);
    }
}

