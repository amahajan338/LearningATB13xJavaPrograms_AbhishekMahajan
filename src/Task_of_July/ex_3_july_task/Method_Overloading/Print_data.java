package Task_of_July.ex_3_july_task.Method_Overloading;

public class Print_data {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printData(7);
        p1.printData(709.98F);
        p1.printData("Lipi");
        System.out.println(p1.printData(7));
        System.out.println(p1.printData(709.98F));
        System.out.println(p1.printData("Lipi"));

    }
}

class Printer {
    String printData(String data) {
        System.out.println("String Datatype!");
        return(data);
    }

    int printData(int data) {
        System.out.println("int Datatype!");
        return(data);
    }

    float printData(float data) {
        System.out.println("float Datatype!");
        return(data);
    }
}
