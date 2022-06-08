package homework07_06;

public class NumberOfSentences {
    public static void main(String[] args) {
        String a ="Is it saturday? Is it raining? Do we have a Java Class today?";
        int count = a.split("[!?.:]+").length;
        System.out.println(count);
    }
}
