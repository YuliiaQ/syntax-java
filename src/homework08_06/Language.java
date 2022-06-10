package homework08_06;

import java.util.Scanner;

public class Language {
    void sayHello(String country) {
        String greeting;
        switch (country) {
            case "Ukraine":
                greeting = "Привіт";
                break;
            case "USA":
                greeting = "Hello";
                break;
            case "Spain":
                greeting = "Holla";
                break;
            case "Italy":
                greeting = "Ciao";
                break;
            case "France":
                greeting = "Bonjour";
                break;
            case "Japan":
                greeting = "Kon’nichiwa";
                break;
            default:
                greeting = "I don't have information regarding this country";
        }
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from?");
        String country = scanner.next();
        Language language = new Language();
        language.sayHello(country);
        scanner.close();
    }
}
