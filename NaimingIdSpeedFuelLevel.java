import java.util.Scanner;

public class NaimingIdSpeedFuelLevel{
    // Vehicle properties
    private String vehicleId;
    private float speed;
    private float fuelLevel;

    // Method to update
    public void updateVehicleStatus(String id, float newSpeed, float newFuelLevel) {
        this.vehicleId = id;

        // Speed is non-negative
        if (newSpeed < 0) {
            this.speed = 0;}
        else {
            this.speed = newSpeed;}

        // Fuel level is between 0 and 100
        if (newFuelLevel < 0) {
            this.fuelLevel = 0;}
        else if (newFuelLevel > 100) {
            this.fuelLevel = 100;}
        else {
            this.fuelLevel = newFuelLevel;
        }
    }

    // Method to display vehicle status
    public String getVehicleStatus() {
        return "Vehicle " + vehicleId + ": Speed = " + speed + " km/h, Fuel = " + fuelLevel + "%";}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

    NaimingIdSpeedFuelLevel vehicle = new NaimingIdSpeedFuelLevel();
    vehicle.updateVehicleStatus(parts[0], Float.parseFloat(parts[1]), Float.parseFloat(parts[2]));
    System.out.println(vehicle.getVehicleStatus());

        scanner.close();
    }
}
