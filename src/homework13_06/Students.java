package homework13_06;
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students

public class Students {
    int id;
    static int numberOfStudent;
    String name;

    public void getValue(int id, String name, int numberOfStudent){
        System.out.println("Students name is " + name + " and student's id is " + id +
                ". Counting with this student the amount of people in group is : " + numberOfStudent);
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();

        student1.name = ("Alien");
        student1.id = 1231;
        numberOfStudent++;
        student1.getValue(student1.id, student1.name, numberOfStudent);

        student2.name = ("Monkey");
        student2.id = 2321;
        numberOfStudent++;
        student2.getValue(student2.id, student2.name, numberOfStudent);

        student3.name = ("Ninja");
        student3.id = 1213;
        numberOfStudent++;
        student3.getValue(student3.id, student3.name, numberOfStudent);

    }
}
