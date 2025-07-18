package Task_of_July.ex_11_july_task;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Task_1_add_and_display {
        public static void main(String[] args) {
            List al = new ArrayList();
            al.add("Dipak");
            al.add("Ravi");
            al.add("Sneha");
            al.add("Priya");
            al.add("Anjali");

            System.out.println(al);

            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));

            }

            System.out.println("---------");

            Iterator iterator = al.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
}