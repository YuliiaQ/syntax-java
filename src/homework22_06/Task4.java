package homework22_06;
//        Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with
//        specific arguments and observe result.
public class Task4 {
    private void say(){
        System.out.println("word");
    }

    private void say(String word){
        System.out.println(word);
    }

    private void say(String word, String phrase){
        System.out.println(word + " " + phrase);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.say();
        task4.say("hohoho");
        task4.say("hohoho", "yohohoho");
    }
}
