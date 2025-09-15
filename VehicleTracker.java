import java.util.Scanner;

/**
 * Vehicle Tracking System
 * This program manages vehicle information including ID, speed, and fuel level.
 */
public class VehicleTracker {
    // Instance variables with meaningful names following Java conventions
    private String vehicleId;
    private float vehicleSpeed;
    private float fuelLevel;
    
    /**
     * Constructor to initialize a vehicle with default values
     */
    public VehicleTracker() {
        this.vehicleId = "";
        this.vehicleSpeed = 0.0f;
        this.fuelLevel = 0.0f;
    }
    
    /**
     * Constructor to initialize a vehicle with given values
     * @param vehicleId The vehicle's unique identifier
     * @param vehicleSpeed The vehicle's speed (must be non-negative)
     * @param fuelLevel The vehicle's fuel level (must be between 0 and 100)
     */
    public VehicleTracker(String vehicleId, float vehicleSpeed, float fuelLevel) {
        this.vehicleId = vehicleId;
        updateVehicleData(vehicleSpeed, fuelLevel);
    }
    
    /**
     * Method to update vehicle's speed and fuel level with validation
     * @param newSpeed The new speed value (must be non-negative)
     * @param newFuelLevel The new fuel level (must be between 0 and 100)
     */
    public void updateVehicleData(float newSpeed, float newFuelLevel) {
        // Validate speed is non-negative
        if (newSpeed >= 0) {
            this.vehicleSpeed = newSpeed;
        } else {
            System.err.println("Warning: Speed cannot be negative. Setting speed to 0.");
            this.vehicleSpeed = 0.0f;
        }
        
        // Validate fuel level is between 0 and 100
        if (newFuelLevel >= 0 && newFuelLevel <= 100) {
            this.fuelLevel = newFuelLevel;
        } else {
            System.err.println("Warning: Fuel level must be between 0 and 100. Setting to valid range.");
            this.fuelLevel = Math.max(0, Math.min(100, newFuelLevel));
        }
    }
    
    /**
     * Method to display the vehicle's current status
     * @return A formatted string containing vehicle information
     */
    public String displayVehicleStatus() {
        return String.format("Vehicle ID: %s, Speed: %.2f, Fuel Level: %.2f", 
                           vehicleId, vehicleSpeed, fuelLevel);
    }
    
    /**
     * Getter methods for accessing vehicle data
     */
    public String getVehicleId() {
        return vehicleId;
    }
    
    public float getVehicleSpeed() {
        return vehicleSpeed;
    }
    
    public float getFuelLevel() {
        return fuelLevel;
    }
    
    /**
     * Setter for vehicle ID
     * @param vehicleId The new vehicle ID
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    /**
     * Main method to handle program execution and input parsing
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read input from user
            String inputLine = scanner.nextLine().trim();
            String[] parts = inputLine.split("\\s+");
            
            if (parts.length != 3) {
                System.err.println("Error: Please provide vehicle ID, speed, and fuel level separated by spaces.");
                return;
            }
            
            // Parse input values
            String vehicleId = parts[0];
            float speed = Float.parseFloat(parts[1]);
            float fuelLevel = Float.parseFloat(parts[2]);
            
            // Create vehicle tracker instance
            VehicleTracker vehicle = new VehicleTracker(vehicleId, speed, fuelLevel);
            
            // Display vehicle status
            System.out.println(vehicle.displayVehicleStatus());
            
        } catch (NumberFormatException e) {
            System.err.println("Error: Speed and fuel level must be valid numbers.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}