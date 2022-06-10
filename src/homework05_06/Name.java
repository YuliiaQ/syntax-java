package homework05_06;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mom's first name");
        String mom = scanner.nextLine();
        System.out.println("Enter dad's first name");
        String dad = scanner.nextLine();
        System.out.println("Do you expect boy or girl?");
        String sex = scanner.nextLine();
        if (sex.equalsIgnoreCase("boy")){
            System.out.println("Boy's name will be : " + mom.toUpperCase().substring(0,3) + dad.toUpperCase().substring(2,4));
        } else if (sex.equalsIgnoreCase("girl")){
            System.out.println("Girl's name will be : " + mom.toUpperCase().substring(1,2) + dad.toUpperCase().substring(0,3));
        } else{
            System.out.println("You will have an alien");
        }
        scanner.close();
    }
}
