public class ElectricCar extends Car {
    int batteryCapacity;
    int range;
    boolean autopilot;

    public void chargeBattery() {
        System.out.println("Electric car is charging.");
    }

    public void printDetails(){
        System.out.println("Brand = "+brand);
        System.out.println("year = "+year);
        System.out.println("Fuel Type = "+fuelType);
        System.out.println("Number Of Seats = "+numberOfSeats);
        System.out.println("Model = "+model);
        System.out.println("Color = "+color);
        System.out.println("Battery Capacity = "+batteryCapacity);
        System.out.println("Range = "+range);
        System.out.println("Autopilot = "+autopilot);
    }

}