

package src.com.problems.ridehailing;
// Car Class extends Vehicle
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Fare based on distance for Car
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Car location updated to: " + newLocation);
    }
}
