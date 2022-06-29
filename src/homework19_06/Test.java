package homework19_06;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(34);
        System.out.println(circle.squareCircle(circle.radius));

        UserInfo userInfo = new UserInfo("Julio", "1234567890", "Earth");
        System.out.println(userInfo.userDetails());
    }
}
