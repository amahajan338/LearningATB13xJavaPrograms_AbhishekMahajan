package Task_of_July.ex_10_july_task;

import java.util.ArrayList;
import java.util.List;

public class Generic_list {
    // List - Collection Framework ->collection of items -> 12,3, sri,

    //Collection frameworks we use in Generics
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Kore");
        normalList.add(true);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Abhi");
    }
}

