public class VehicleRunner {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.brand = "Tesla";
        eCar.year = 2023;
        eCar.fuelType = "Electric";
        eCar.numberOfSeats = 4;
        eCar.model = "Model S";
        eCar.color = "Red";
        eCar.batteryCapacity = 100;
        eCar.range = 350;
        eCar.autopilot = true;

        eCar.honk();
        eCar.chargeBattery();
        eCar.printDetails();

    }
}