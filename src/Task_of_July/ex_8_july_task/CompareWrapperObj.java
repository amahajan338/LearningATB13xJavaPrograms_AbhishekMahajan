package Task_of_July.ex_8_july_task;

public class CompareWrapperObj {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        Integer c = 200; // Autoboxing a value outside the cache range
        Integer d = 200; // Autoboxing a value outside the cache range

        System.out.println("a == b:" + (a==b));
        System.out.println("c == d:" + (c==d));
        System.out.println("a.equals(b):" +a.equals(b));
        System.out.println("c.equals(d):" + c.equals(d));
    }
}
