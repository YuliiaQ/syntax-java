package homework16_06;
//Create a method that will accept a String as a parameter and return a new
//String that consist only of vowels. Method should be available inside the class only
// where it was declared and executed by calling it is name.

public class Task3 {
    private static String vowels(String str){
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : chars){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
