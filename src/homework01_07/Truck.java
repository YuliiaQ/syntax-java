package homework01_07;

class Truck extends Vehicle {
    double weight;

    Truck(double vehiclePrice, double weight) {
        this.vehiclePrice = vehiclePrice;
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return vehiclePrice / 100 * 90;
        } else {
            return vehiclePrice / 100 * 80;
        }
    }
}
