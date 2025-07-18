package Task_of_July.ex_15_july_task;

import java.util.*;

public class Task_7_filter_student_name_start_with_A {
    public static void main(String[] args)
    {
        // Step 1: Create and populate the HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Anjali");
        studentMap.put(102, "Dipak");
        studentMap.put(103, "Aman");
        studentMap.put(104, "Ravi");

        // Step 2: Filter and print names starting with 'A'
        System.out.println("Students with names starting with 'A':");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet())
        {
            if (entry.getValue().startsWith("A"))
            {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
