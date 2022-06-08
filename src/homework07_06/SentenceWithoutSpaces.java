package homework07_06;

import java.util.Scanner;

public class SentenceWithoutSpaces {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Your sentence is : " + sentence);
        sentence = sentence.replaceAll("\\s+", "");
        System.out.println(sentence);
    }
}
