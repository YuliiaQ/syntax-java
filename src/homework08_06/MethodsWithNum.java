package homework08_06;

import java.util.Scanner;

public class MethodsWithNum {

    int largerNum(int num1, int num2) {
        int numLarg = 0;
        if (num1 > num2) {
            numLarg = num1;
        } else if (num1 < num2) {
            numLarg = num2;
        } else {
            System.out.println("the numbers are equals");
        }
        return numLarg;
    }

    void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Num is even");
        } else {
            System.out.println("Num is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        MethodsWithNum num = new MethodsWithNum();
        System.out.println("The largest num among these is : " + num.largerNum(num1, num2));

        System.out.println("Enter any number and the program will say if it even or odd");
        int evenOrOddNum = scanner.nextInt();
        num.evenOrOdd(evenOrOddNum);
        scanner.close();
    }
}
