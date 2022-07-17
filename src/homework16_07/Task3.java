package homework16_07;
//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet <String> cities = new LinkedHashSet<>();
        cities.add("Alushta");
        cities.add("Kyiv");
        cities.add("Las Vegas");
        cities.add("New York");
        cities.add("Alexandria");
        cities.add("Ankara");
        cities.removeIf(element -> element.startsWith("A"));
        System.out.println(cities);
    }
}
