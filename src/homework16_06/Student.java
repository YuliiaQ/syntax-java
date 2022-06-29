package homework16_06;
//Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables. Print name & address of given
// student using displayInfo method.
public class Student {

    String name;
    String address;

    Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    String displayInfo(){
        return "Student's name is " +name+ " and address is "+address;
    }

    public static void main(String[] args) {
        Student student = new Student("Pablo", "Columbia");
        System.out.println(student.displayInfo());
    }
}
