package homework04_07;

import java.util.ArrayList;
import java.util.List;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
//Create an arrayList of words. Remove every word that ends with “e”.
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Task1 {
    public static void main(String[] args) {
        List<String> cars= new ArrayList<>();
        cars.add("Porsche");
        cars.add("Audi");
        cars.add("Rolls Royce");
        for(String car:cars){
            System.out.println(car);
        }
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println(cars);

        List<String> words = new ArrayList<>();
        words.add("food");
        words.add("cat");
        words.add("tank");
        words.add("horse");
        words.add("lake");
        for(int i=0; i< words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }

        List<String> drinks = new ArrayList<>();
        drinks.add("margarita");
        drinks.add("boulevardier");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("whiskey");
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);

        List<Integer> evenNumbers = new ArrayList<>();
        for(int i=2; i<=500; i+=2){
            evenNumbers.add(i);
        }
        for(int i=0; i< evenNumbers.size(); i++){
            if(evenNumbers.get(i)%5==0){
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);
    }
}
