package homework16_06;

//Write a java class that have 4 constructors with 4 different access levels of
// constructors(private,public,default,protected) and create 4 objects of this class:
// 1 - inside same class; 2 - from outside the class; 3 - from different class inside
// different package  and observe result.

public class Task6 {

    String actor;
    String movie;
    String country;
    int yearOfPremiere;

    private Task6(){
    }

    public Task6(String actor, String movie){
        actor = actor;
        movie = movie;
    }

    Task6(String actor, String movie, String country){
        actor = actor;
        movie = movie;
        country = country;
    }

    protected Task6(String actor, String movie, String country, int yearOfPremiere){
        actor = actor;
        movie = movie;
        country = country;
        yearOfPremiere = yearOfPremiere;
    }

    Task6 film1 = new Task6();
    Task6 film2 = new Task6("Leonardo DiCaprio", "Inception");
    Task6 film3 = new Task6("Johny Depp", "Pirates of the Caribbean", "United States");
    Task6 film4 = new Task6("Jason Statham", "Wrath of Man", "Great Britain", 2021);
}
