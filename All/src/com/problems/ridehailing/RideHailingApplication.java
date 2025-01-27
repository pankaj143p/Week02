package src.com.problems.ridehailing;

// Main class to demonstrate the Ride-Hailing Application
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Vehicle car = new Car("V001", "John Doe", 10.0, "Downtown");
        Vehicle bike = new Bike("V002", "Jane Smith", 5.0, "Uptown");
        Vehicle auto = new Auto("V003", "Mark Johnson", 7.0, "Suburbs");

        // List of vehicles
        Vehicle[] vehicles = {car, bike, auto};

        // Processing each vehicle for fare calculation and GPS functionality
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            double distance = 15.0; // Example distance for fare calculation
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            // Using polymorphism to access GPS functionality
            if (vehicle instanceof GPS) {
                GPS gpsVehicle = (GPS) vehicle;
                System.out.println("Current Location: " + gpsVehicle.getCurrentLocation());
                gpsVehicle.updateLocation("New Location");
            }
            System.out.println("---------------------------------");
        }
    }
}