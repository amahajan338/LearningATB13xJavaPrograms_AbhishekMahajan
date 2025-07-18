package Task_of_July.ex_15_july_task;

import java.util.*;

public class Task_4_char_freq_count {
    public static void main(String[] args)
    {
        // Input string
        String input = "aabbccddeeffffdsdghhhghh";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character
        for (char ch : input.toCharArray())
        {
            if (charCountMap.containsKey(ch))
            {
                // Increment count if already present
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else
            {
                // Add new character with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Print the character frequencies
        for (char ch : charCountMap.keySet())
        {
            System.out.println(ch + " -> " + charCountMap.get(ch));
        }
    }
}
