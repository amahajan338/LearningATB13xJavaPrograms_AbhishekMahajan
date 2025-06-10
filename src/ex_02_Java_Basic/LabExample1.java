package ex_02_Java_Basic;

public class LabExample1 {
    //
    //    int i;
    //    static int s;
    //

    public static void main(String[] args) {
        //Global Variable
        int a = 10;
        {
            //Local Variable
            int b = 10;
            System.out.println(b);
        }
        //Value set in the local env will be limited to that env and Global in which the local is set.
        //Value out-side the local env will be changed.
        int b = 90;
        System.out.println(b);

    }
}
