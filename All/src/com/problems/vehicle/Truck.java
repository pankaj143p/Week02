
package src.com.problems.vehicle;
class Truck extends Vehicle implements Insurable {
private String insurancePolicyNumber;

public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
    super(vehicleNumber, type, rentalRate);
    this.insurancePolicyNumber = insurancePolicyNumber;
}

@Override
public double calculateRentalCost(int days) {
    return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
    return 0.07 * getRentalRate();
}

@Override
public String getInsuranceDetails() {
    return "Insurance Policy Number: " + insurancePolicyNumber;
}
}