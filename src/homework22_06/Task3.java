package homework22_06;
////        Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with
////        specific arguments and observe result.

public class Task3 {
    public void say(){
        System.out.println("word");
    }

    public void say(String word){
        System.out.println(word);
    }

    public void say(String word, String phrase){
        System.out.println(word + " " + phrase);
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.say();
        task3.say("say", "some words");
        task3.say("word");
    }
}
