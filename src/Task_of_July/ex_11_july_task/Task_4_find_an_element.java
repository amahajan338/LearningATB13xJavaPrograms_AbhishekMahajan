package Task_of_July.ex_11_july_task;

import java.util.*;

public class Task_4_find_an_element {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("Mumbai");
        al.add("delhi");
        al.add("Pune");

        System.out.println(al);

        if(al.contains("Pune"))
        {
            System.out.println("Pune is in the list.");
        }
        else
        {
            System.out.println("Pune is Not in the list.");
        }

    }
}
