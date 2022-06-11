package homework08_06;

import java.util.Scanner;

public class IsPrimeOrNot {

    boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = scanner.nextInt();
        IsPrimeOrNot primeOrNot = new IsPrimeOrNot();
        boolean isPrime = primeOrNot.isPrime(num);
        if (isPrime) {
            System.out.println("Is prime");
        } else {
            System.out.println("Is not prime");
        }
        scanner.close();
    }
}


