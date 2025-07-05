package Task_of_July.ex_4_july_task;

public class Private_Access_Modifier {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Amol Tarapure");
        System.out.println("Name " + person.getName());


    }
}


class Person
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
