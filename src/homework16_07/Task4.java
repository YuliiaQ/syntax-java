package homework16_07;
//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Jack Sparrow", 01);
        students.put("Darth Vader", 02);
        students.put("Adolf Hitler", 03);
        students.put("Stepan Bandera", 04);

        Iterator<String> iterator = students.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
