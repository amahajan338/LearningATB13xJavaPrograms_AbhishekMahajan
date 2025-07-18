package Task_of_July.ex_15_july_task;

import java.util.*;

public class Task_1_word_count_using_hashmap  {
    public static void main(String[] args)
    {
        // Input sentence
        String input = "java is easy and java is powerful";

        // Convert the sentence into an array of words
        String[] words = input.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words)
        {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word))
            {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else
            {
                // Otherwise, add the word with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word frequencies
        for (String word : wordCountMap.keySet())
        {
            System.out.println(word + " -> " + wordCountMap.get(word));
        }
    }
}
