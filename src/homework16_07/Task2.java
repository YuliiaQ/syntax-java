package homework16_07;
//Create a Set collection in which you need to add names of the countries.
// In this set we want all objects to be sorted in alphabetical order.
// Using 2 different ways retrieve all elements from set.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Set <String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Spain");
        countries.add("Albania");
        countries.add("Greece");
        countries.add("Montenegro");
        System.out.println(countries);

        List<String> list = new ArrayList<>(countries);
        Collections.sort(list);
        System.out.println(list);

        Iterator <String> value = countries.iterator();
        while (value.hasNext()) {
            System.out.print(value.next()+", ");
        }
    }
}
