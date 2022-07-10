package homework01_07;

public class Test {
    public static void main(String[] args) {

        WebDriver[] drivers={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver driver:drivers ){
            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();
        }

        Shape[] shapes = {new Circle(), new Square()};
        for(Shape shape:shapes){
            System.out.println(shape.calculateArea(5));
            System.out.println(shape.calculatePerimeter(5));
        }

        Registration registration = new Registration();
        registration.setEmail();
        registration.setUsername();
        registration.setPassword();
        System.out.println(registration.getEmail());
        System.out.println(registration.getUsername());
        System.out.println(registration.getPassword());

        Vehicle[] vehicles = {new Sedan(50000, 18.5), new Truck(100000, 1800)};
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle.calculateSalePrice());
        }

        Marks[] marks = {new A(85, 49, 68), new B(96, 87, 75, 79)};
        for (Marks mark:marks){
            System.out.println(mark.getAverage());
        }
    }
}
