package Task_of_July.ex_10_july_task;

public class Generic_java {
    public static void main(String[] args) {
        int res1=  temp_sum(10, 20);
        double res2 = temp_sum(23.5, 56.9);
        String res3 = temp_sum("sri", "Latha");
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }

    //here if we want to do sum for different datatypes we use different functions
    // so, for this to make as single function we use Generics
    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}
