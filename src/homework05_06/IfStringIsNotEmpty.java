package homework05_06;

import java.util.Scanner;

public class IfStringIsNotEmpty {
    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int mid = 0;
        if (!sentence.isEmpty()){
            if (sentence.length()%2 == 0 && sentence.length()>=3){
                mid = (sentence.length()-1)/2;
                System.out.println("The middle letter is : " + sentence.charAt(mid));
            } else {
                System.out.println("The amount of letters is even");
            }
            } else {
                System.out.println("Sentence is empty");
            }
        scanner.close();
        }
    }

