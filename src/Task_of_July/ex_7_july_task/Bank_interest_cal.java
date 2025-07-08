package Task_of_July.ex_7_july_task;

public class Bank_interest_cal {
    //main class to declare
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getInterestRate();

        HDFC hdfc = new HDFC();
        hdfc.getInterestRate();
    }
}

//Abstract class of Bank which can be used to extend
abstract class Bank{
    //Method to get interest rate.
    abstract void getInterestRate();
}

class SBI extends Bank{

    @Override
    void getInterestRate(){
        //Output of Interest rate of SBI.
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank{

    @Override
    void getInterestRate(){
        //Output of Interest rate of HDFC.
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}