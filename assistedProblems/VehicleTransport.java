package assistedProblems;
class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
   public void displayInfo(){
       System.out.println("max speed in km/h: "+maxSpeed);
       System.out.println("type of fuel: "+fuelType);
   }

}
class Car extends Vehicle{
    private int numberOfSeats;
    Car(int maxSpeed, String fuelType, int numberOfSeats){
        super(maxSpeed,fuelType);
        this.numberOfSeats=numberOfSeats;
    }
    public void displayInfo(){
        System.out.println("Car Details: ");
        super.displayInfo();
        System.out.println("Number of seats: "+numberOfSeats);
    }
}

class Truck extends Vehicle{
    private int maxWeightLoaded;
    Truck(int maxSpeed, String fuelType, int maxWeightLoaded){
        super(maxSpeed,fuelType);
        this.maxWeightLoaded=maxWeightLoaded;
    }
    public void displayInfo(){
        System.out.println("Truck Details: ");
        super.displayInfo();
        System.out.println("maximum weight in ton : "+maxWeightLoaded);
    }
}

class Motorcycle extends Vehicle{
    private double milage;
    Motorcycle(int maxSpeed, String fuelType, double milage){
        super(maxSpeed,fuelType);
        this.milage=milage;
    }
    public void displayInfo(){
        System.out.println("Motorcycle Details: ");
        super.displayInfo();
        System.out.println("milage of bike in km/l: "+milage);
    }
}

public class VehicleTransport {
    public static void main(String[] args) {
        Car c=new Car(230,"Diesel",8);
        Truck t=new Truck(180,"Diesel",243);
        Motorcycle m=new Motorcycle(140,"Petrol",67.9);
        Vehicle objectArray[]={c,t,m};
        for(Vehicle v : objectArray){
            v.displayInfo();
        }
    }

}
