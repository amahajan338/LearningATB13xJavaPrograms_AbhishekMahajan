package Task_of_July.ex_11_july_task;

import java.util.*;

public class Task_5_compare_array_and_linkedlist {
    public static void main(String[] args)
    {
        // ArrayList performance test
        List<Integer> arrayList = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endArrayList - startArrayList) + " ms");

        // LinkedList performance test
        List<Integer> linkedList = new LinkedList<>();
        long startLinkedList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endLinkedList - startLinkedList) + " ms");

    }
}
