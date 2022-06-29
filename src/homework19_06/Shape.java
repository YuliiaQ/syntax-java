package homework19_06;

//Write program: Shape class has a constructor that takes the radius and has a subclass as
//circle class. In circle class create a method to calculate the area of circle. Test your code

public class Shape {
    double radius;

    Shape(double radius) {
        this.radius = radius;
    }

}
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }

    public double squareCircle(double radius){
        return Math.pow(radius , 2) * 3.14;
    }
}
