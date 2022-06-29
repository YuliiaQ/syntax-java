package homework25_06;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//        Define common behavior within parent class and override some of the methods in child classes
//        Define some methods specific to child classes
//        Write example of achieving run time polymorphism
public class Student {

    String name;
    Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + " is studying");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void cry() {
        System.out.println(name + " is crying over programming");
    }

    static class SyntaxStudent extends Student{
        SyntaxStudent(String name) {
            super(name);
        }
    }
    static class CollegeStudent extends Student{
        CollegeStudent(String name) {
            super(name);
        }
    }
    static class SchoolStudent extends Student{
        SchoolStudent(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        SyntaxStudent syntaxStudent = new SyntaxStudent("Syntax student");
        CollegeStudent collegeStudent = new CollegeStudent("CollegeStudent");
        SchoolStudent schoolStudent = new SchoolStudent("School student");
        syntaxStudent.cry();
        collegeStudent.study();
        schoolStudent.sleep();
    }
}
