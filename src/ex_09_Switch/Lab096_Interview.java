package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {
        char code = 'C';
//The order of the switch dose not matter.
        switch (code){
            case 'D':
                System.out.println("Breaking Bad");
                break;
            default:
                System.out.println("Hellooooooo");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
