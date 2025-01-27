package src.com.problems.vehicle;
public class VehicleRentalSystem {
public static void main(String[] args) {
    Vehicle car = new Car("C123", "Car", 50.00, "INS12345");
    Vehicle bike = new Bike("B456", "Bike", 20.00, "INS67890");
    Vehicle truck = new Truck("T789", "Truck", 100.00, "INS11223");
    Vehicle[] vehicles = { car, bike, truck };
    for (Vehicle vehicle : vehicles) {
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
        if (vehicle instanceof Insurable) {
            Insurable insurableVehicle = (Insurable) vehicle;
            System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
            System.out.println(insurableVehicle.getInsuranceDetails());
        }
        System.out.println("---------------------------------");
    }
}
}
