package Task_of_July.ex_11_july_task;

import java.util.*;

public class Task_2_remove_an_element {
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList();
        al.add("Amit");
        al.add("Neha");
        al.add("Suresh");

        System.out.println(al);

        al.remove("Neha");

        System.out.println(al);
    }
}
