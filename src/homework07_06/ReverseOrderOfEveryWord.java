package homework07_06;

public class ReverseOrderOfEveryWord {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
        System.out.println("Original string : " + str);

        String split[] = str.split("\\s");
        String reversedString = "";

        for (int i = 0; i < split.length; i++) {
            String reverseWord = "";
            for (int j = split[i].length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + split[i].charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + reversedString);
    }
}
