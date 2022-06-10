package homework07_06;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth");
        String str = scanner.nextLine();
        String reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
        scanner.close();
    }
}
