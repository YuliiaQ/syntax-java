package homework16_06;
//Create a method that will take a String as a parameter and returns reversed String.
// Method should be available to all classes within your project and accessible by class name.
public class Task2 {
    public static String reverseStr (String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
