package homework07_06;

public class ReplaceWithoutTemp {
    public static void main(String[] args) {
        String str1 = "This is string 1";
        String str2 = "This is string 2";
        System.out.println(str1.replace(str1, str2));
        System.out.println(str2.replace(str2, str1));
    }
}
