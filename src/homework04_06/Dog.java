package homework04_06;

public class Dog {
    String name;
    int age;
    double weight;
    String color;
    String breed;

    void voice(){
        System.out.println("bark bark");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "French Bulldog";
        dog1.name = "Ricky";
        dog1.age = 1;
        dog1.weight = 6.5;
        dog1.color = "black";
        dog1.voice();

        Dog dog2 = new Dog();
        dog2.breed = "Husky";
        dog2.name = "Richie";
        dog2.age = 5;
        dog2.weight = 26.5;
        dog2.color = "grey";
        dog2.voice();

        Dog dog3 = new Dog();
        dog3.breed = "Doberman";
        dog3.name = "Ross";
        dog3.age = 8;
        dog3.weight = 28.5;
        dog3.color = "white";
        dog3.voice();

        System.out.println("The first dog is a " + dog1.breed + ". His name is " + dog1.name +
                ".\nComparing to the second dog " + dog2.breed + " which name is " + dog2.name +
                " he is younger cause his age is " + dog1.age + " and " + dog2.name + " is " + dog2.age + ".\nTheir friend " +
                dog3.breed + " " + dog3.name + " is " + dog3.age + ". All of them are not so small cause their \nweights are : " +
                dog1.weight + ", " + dog2.weight + ", " + dog3.weight + ".");
    }
}
