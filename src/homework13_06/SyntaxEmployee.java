package homework13_06;

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
