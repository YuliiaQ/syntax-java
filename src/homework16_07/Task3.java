package homework16_07;
//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Alushta");
        cities.add("Kyiv");
        cities.add("Las Vegas");
        cities.add("New York");
        cities.add("Alexandria");
        cities.add("Ankara");

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}

