package homework08_06;

import java.util.Scanner;

public class Student {

    void getGrade(int score) {
        String grade = "";
        if (score >= 90 && score < 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 50 && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is "+grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        Student student = new Student();
        student.getGrade(score);
        scanner.close();
    }
}
