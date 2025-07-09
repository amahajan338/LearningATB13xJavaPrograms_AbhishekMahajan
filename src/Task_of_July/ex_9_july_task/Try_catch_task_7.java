package Task_of_July.ex_9_july_task;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Task 7: Handle Checked Exception using Try-Catch
Description:
Open a file using FileReader and handle FileNotFoundException using try-catch.
*/

public class Try_catch_task_7 {
    public static void main(String[] args) {
        try {
            // Attempt to open a file named "sample.txt"
            FileReader reader = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        System.out.println("Program continues after file handling.");
    }
}
