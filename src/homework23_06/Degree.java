package homework23_06;
//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
    static class Bachelors extends Degree{

    }
    static class Masters extends Degree{
        @Override
        public void getPrerequisite() {
            System.out.println("To get a degree you need bachelors diploma");
        }
    }

    public static void main(String[] args) {
        Degree student1 = new Degree();
        Bachelors student2 = new Bachelors();
        Masters student3 = new Masters();
        student1.getPrerequisite();
        student2.getPrerequisite();
        student3.getPrerequisite();
    }
}
