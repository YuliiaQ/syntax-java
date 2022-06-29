package homework16_06;
//Write a java Class Students that have a constructor which takes students
// name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks. Your program should print
// an average mark of each students name.
//NOTE: please use different names for instance and local variables.

public class Students {

    int mathGrade;
    int historyGrade;
    int chemistryGrade;
    String name;

    Students(String name, int mathGrade, int historyGrade, int chemistryGrade){
        this.name = name;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.chemistryGrade = chemistryGrade;
    }

    int avGrade(){
        return (mathGrade+historyGrade+chemistryGrade)/3;
    }

    public static void main(String[] args) {
        Students student1 = new Students("Dog", 90, 80, 95);
        System.out.println(student1.name + " average grade is " + student1.avGrade());
        Students student2 = new Students("Cat", 77, 99,81);
        System.out.println(student2.name + " average grade is " + student2.avGrade());
        Students student3 = new Students("Frog", 65, 60, 88);
        System.out.println(student3.name + " average grade is " + student3.avGrade());
        Students student4 = new Students("Horse", 100, 78, 93);
        System.out.println(student4.name + " average grade is " + student4.avGrade());
        Students student5 = new Students("Monkey", 60, 89,100);
        System.out.println(student5.name + " average grade is " + student5.avGrade());
    }

}
