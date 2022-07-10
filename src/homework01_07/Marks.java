package homework01_07;

/*We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
 Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
 Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the
 marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
 */

abstract class Marks {
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    abstract int getAverage();
}
