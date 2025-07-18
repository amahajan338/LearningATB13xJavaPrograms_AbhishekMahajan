package Task_of_July.ex_11_july_task;

import java.util.*;

public class Task_6_insert_in_middle_of_linkedlist {
    public static void main(String[] args)
    {
        // Create LinkedList with initial fruits
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Insert "Orange" at index 1
        fruits.add(1, "Orange");

        // Print the final list
        System.out.println("Fruits List: " + fruits);
    }
}
