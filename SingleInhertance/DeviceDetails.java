/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass
and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritan
 */
package SingleInhertance;
class Device{
    String deviceId;
    String status;
    Device(String deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayStatus(){
        System.out.println("id of device: "+deviceId);
        System.out.println("status of device: "+status);
    }
}
class Thermostat extends Device{
    private String temperatureSetting;
    Thermostat(String deviceId, String status, String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("setting of this device: "+temperatureSetting);
    }
}
public class DeviceDetails {
    public static void main(String[] args) {
        Device d,t;
        d=new Device("10227ads2","working");
        t=new Thermostat("2332hs092","not working","new features");
        d.displayStatus();
        t.displayStatus();
    }
}
