package homework01_07;

class Sedan extends Vehicle{
    double length;

    Sedan(double vehiclePrice, double length){
        this.vehiclePrice = vehiclePrice;
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return vehiclePrice/100*95;
        } else{
            return vehiclePrice/100*90;
        }
    }
}
