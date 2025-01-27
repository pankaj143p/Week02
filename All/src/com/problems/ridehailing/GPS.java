package src.com.problems.ridehailing;
// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}