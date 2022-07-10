package homework01_07;

class Circle implements Shape{

    public double calculateArea(int r) {
        return 3.14*r*r;
    }
    public double calculatePerimeter(int r) {
        return 2*3.14*r;
    }
}
