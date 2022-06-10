package homework08_06;

import java.util.Scanner;

public class Palindrome {

    void isPalindrome(String word) {
        String reverseWord = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word and the program will say if it is palindrome or not");
        String word = scanner.next();
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(word);
        scanner.close();
    }
}
