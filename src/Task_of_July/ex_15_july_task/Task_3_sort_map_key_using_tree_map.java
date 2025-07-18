package Task_of_July.ex_15_july_task;

import java.util.*;

public class Task_3_sort_map_key_using_tree_map {
    public static void main(String[] args)
    {
        // Step 1: Create and populate the HashMap
        HashMap<String, Integer> marksMap = new HashMap<>();
        marksMap.put("Ravi", 80);
        marksMap.put("Anjali", 95);
        marksMap.put("Dipak", 75);

        // Step 2: Transfer data to TreeMap to sort by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(marksMap);

        // Step 3: Print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
