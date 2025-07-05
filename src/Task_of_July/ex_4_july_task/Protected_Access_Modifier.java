package Task_of_July.ex_4_july_task;

public class Protected_Access_Modifier {
    public static void main(String[] args)
    {
        Dog_2 d2 = new Dog_2();
        d2.doEat();

    }
}

class Animal_2
{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog_2 extends Animal_2
{
    void doEat()
    {
        super.eat();
    }
}
