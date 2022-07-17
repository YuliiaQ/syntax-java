package homework16_07;
//How can you remove all duplicates from ArrayList?
//List<String> aList=new ArrayList<>();
//aList.add("John");
//aList.add("Jane");
//aList.add("James");
//aList.add("Jasmine");
//aList.add("Jane");
//aList.add("James");

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        List<String> newList=new ArrayList<>();
        for (String element : aList) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        System.out.println(newList);
    }
}
