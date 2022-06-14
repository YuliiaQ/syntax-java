package homework13_06;
//Create a Class called SyntaxEmployee:
//Create three  variables  empID , salary and set the CEO to “Sumair”
//Create two objects of the class SyntaxEmployee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

public class SyntaxEmployee {
    int empId;
    double salary;
    static String ceo = "Sumair";

    public void printValue(int empId, double salary, String ceo) {
        System.out.println("The employee id is " + empId + " and the salary is " + salary + " and the CEO of this company is " + ceo);
    }

    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee1 = new SyntaxEmployee();
        SyntaxEmployee syntaxEmployee2 = new SyntaxEmployee();

        syntaxEmployee1.empId = 123;
        syntaxEmployee1.salary = 4500.00;
        syntaxEmployee1.printValue(syntaxEmployee1.empId, syntaxEmployee1.salary, ceo);

        syntaxEmployee2.empId = 1234;
        syntaxEmployee2.salary = 5500.00;
        syntaxEmployee2.printValue(syntaxEmployee2.empId, syntaxEmployee2.salary, ceo);
    }
}
