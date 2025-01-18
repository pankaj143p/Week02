public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RENTAL_COST = 50.0; // Cost per day for renting a car

    // Default constructor (sets default values)
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
    }

    // Parameterized constructor (sets user-provided values)
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor (creates a new car rental with the same details as another rental)
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_COST;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Creating a rental using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Creating a rental using the parameterized constructor
        CarRental customRental = new CarRental("John Doe", "Tesla Model S", 5);
        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();

        // Creating a rental using the copy constructor
        CarRental copyRental = new CarRental(customRental);
        System.out.println("\nCopied Rental:");
        copyRental.displayRentalDetails();
    }
}
