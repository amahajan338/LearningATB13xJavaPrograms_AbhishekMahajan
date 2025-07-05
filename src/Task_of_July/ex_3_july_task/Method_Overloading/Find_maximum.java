package Task_of_July.ex_3_july_task.Method_Overloading;

public class Find_maximum {
    public static void main(String[] args) {
        Utility u1 = new Utility();
        //u1.max(6,9);
        u1.max(8,2);

        //u1.max(7,9,8);
        //u1.max(5,3,9);
        u1.max(9,2,4);

        //u1.max(7.98,8.97);
        u1.max(9.78,4.98);
    }
}

class Utility {
    int max(int a, int b) {
        System.out.println("Largest of 2 No's with int datatype:");
        int max = (a > b) ? a : b;
        System.out.println(max + " is largest number!");
        return max;
    }

    int max(int a, int b, int c) {
        System.out.println("Largest of 3 No's with int datatype:");
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max + " is largest number!");
        return max;
    }

    double max(double a, double b) {
        System.out.println("Largest of 2 No's with double datatype:");
        double max = (a > b) ? a : b;
        System.out.println(max + " is largest number!");
        return max;
    }
}
