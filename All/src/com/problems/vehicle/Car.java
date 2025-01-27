package src.com.problems.vehicle;
class Car extends Vehicle implements Insurable {
private String insurancePolicyNumber;

public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
    super(vehicleNumber, type, rentalRate);
    this.insurancePolicyNumber = insurancePolicyNumber;
}

@Override
public double calculateRentalCost(int days) {
    return getRentalRate() * days;
}

@Override
public double calculateInsurance() {
    return 0.05 * getRentalRate();
}

@Override
public String getInsuranceDetails() {
    return "Insurance Policy Number: " + insurancePolicyNumber;
}
}

