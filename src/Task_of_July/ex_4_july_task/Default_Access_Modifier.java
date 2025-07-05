package Task_of_July.ex_4_july_task;

public class Default_Access_Modifier {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.showDetails();

        TestDefault td = new TestDefault();
        td.showDetails();
    }
}

class Student
{
    void showDetails()
    {
        System.out.println("Student details");
    }
}

class TestDefault extends Student
{
    void showDetails()
    {
        super.showDetails();
        System.out.println("Test details");
    }
}
