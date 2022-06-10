package homework04_06;

public class Phone {
    String model;
    double price;
    String manufacturer;

    void call() {
        System.out.println("ring ring");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "Iphone";
        phone1.manufacturer = "Apple";
        phone1.price = 1100.50;
        phone1.call();

        Phone phone2 = new Phone();
        phone2.model = "Samsung Galaxy";
        phone2.manufacturer = "Samsung";
        phone2.price = 1200.50;
        phone2.call();

        Phone phone3 = new Phone();
        phone3.model = "Pixel";
        phone3.manufacturer = "Google";
        phone3.price = 1300.50;
        phone3.call();
    }
}
