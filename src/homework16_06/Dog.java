package homework16_06;
//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.

public class Dog {
    private int year;
    private String name;
    private String breed;

    public Dog(){
    }
    public Dog(int year, String name, String breed){
        this.year = year;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog's info : {" +
                "Dog's year af birth =" + year +
                ", and name ='" + name + '\'' +
                ", breed ='" + breed + '\'' +
                '}';
    }
}
