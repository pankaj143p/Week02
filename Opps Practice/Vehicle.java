public class Vehicle {
    static int registrationFee;
    private final int registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    // Create a static method updateRegistrationFee to modify the fee.
    public static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }
    // Create a static method isVehicle which returns true if the object is an instance of the Vehicle class.
    public boolean isVehicle(Vehicle vehicle) {
        return vehicle instanceof Vehicle;
    }
    // Create a method toString to display the vehicle details.
    public String toString() {
        return "Owner Name: " + ownerName + "\nVehicle Type: " + vehicleType + "\nRegistration Number: " + registrationNumber;
    }


        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle("Nikhil", "Car", 123);
            Vehicle.updateRegistrationFee(1000);
            System.out.println(vehicle);
            System.out.println("Is Vehicle: " + vehicle.isVehicle(vehicle));

    }

}
