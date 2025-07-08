package Task_of_July.ex_8_july_task;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {

        int a = 45;
        Integer b = a;
        int c = b;

        System.out.println("Primitive:" + a); //Primitive
        System.out.println("Wrapper:" + b.intValue()); //Wrapper
        System.out.println("Unboxed again:" + c); //Unboxed again
    }
}
