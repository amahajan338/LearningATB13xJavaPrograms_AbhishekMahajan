package Task_of_July.ex_4_july_task;

public class Public_Access_Modifier {
    public static void main(String[] args) {
        Student_1 s1 = new Student_1();
        s1.showInfo();
    }
}

class Student_1{
    public void showInfo()
    {
        System.out.println("Public Access: Student Info");
    }
}