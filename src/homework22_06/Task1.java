package homework22_06;

//Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//        Rectangle
//        Square
//        Box
public class Task1 {

    static void area(int a) {
        double res = Math.pow(a, 2);
        System.out.println("Square area is : " + res);
    }

    static void area(int a, int b) {
        double res = 0;
        res = a * b;
        System.out.println("Square rectangle is : " + res);
    }

    static void area(int l, int w, int h) {
        System.out.println("Area of the box is : " + (2 * l * w + 2 * l * h + 2 * w * h));
    }
}

class MathTest {
    public static void main(String[] args) {
        Task1.area(8);
        Task1.area(5, 9);
        Task1.area(2, 4, 7);
    }

}

