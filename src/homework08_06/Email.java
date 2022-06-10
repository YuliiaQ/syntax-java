package homework08_06;

import java.util.Scanner;

public class Email {
    void createEmail (String name, String lastName, String emailType){
        System.out.println(name+"."+lastName+"@"+emailType+".com");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = scanner.next();
        System.out.println("Enter you last name");
        String lastName = scanner.next();
        System.out.println("Enter the email type");
        String emailType = scanner.next();
        Email email = new Email();
        email.createEmail(name, lastName, emailType);
        scanner.close();
    }
}
