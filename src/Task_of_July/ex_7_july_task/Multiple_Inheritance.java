package Task_of_July.ex_7_july_task;

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        d.show();
    }
}

interface Printable
{
    void print();
    void show();
}

// Second interface
interface Showable
{
    void show();
    void print();
}

// Class implementing both interfaces
class Document implements Printable, Showable
{
    // Implementing print() from Printable
    public void print()
    {
        System.out.println("Printing Document");
    }

    // Implementing show() from Showable
    public void show()
    {
        System.out.println("Showing Document");
    }
}

