package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
//        not(true) = false
        System.out.println(!a);

        boolean b = true;
//        not(not(true)) >> not(false) >> true
        System.out.println(!!b);

        boolean c= true || false;
//      true or false >> '||' is OR Gate
        System.out.println(c);


        boolean c1= true && false;
//      true and false >> '&&' AND Gate
        System.out.println(c1);
    }

}
