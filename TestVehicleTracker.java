/**
 * Test class to demonstrate VehicleTracker functionality
 */
public class TestVehicleTracker {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Tracker System Test ===\n");
        
        // Test 1: Valid values
        System.out.println("Test 1: Valid vehicle data");
        VehicleTracker vehicle1 = new VehicleTracker("CAR001", 65.5f, 75.0f);
        System.out.println(vehicle1.displayVehicleStatus());
        
        // Test 2: Update method
        System.out.println("\nTest 2: Updating vehicle data");
        vehicle1.updateVehicleData(80.0f, 60.0f);
        System.out.println(vehicle1.displayVehicleStatus());
        
        // Test 3: Validation - negative speed
        System.out.println("\nTest 3: Negative speed validation");
        VehicleTracker vehicle2 = new VehicleTracker("CAR002", -20.0f, 50.0f);
        System.out.println(vehicle2.displayVehicleStatus());
        
        // Test 4: Validation - fuel level out of range
        System.out.println("\nTest 4: Fuel level validation");
        VehicleTracker vehicle3 = new VehicleTracker("CAR003", 45.0f, 150.0f);
        System.out.println(vehicle3.displayVehicleStatus());
        
        // Test 5: Boundary values
        System.out.println("\nTest 5: Boundary values");
        VehicleTracker vehicle4 = new VehicleTracker("CAR004", 0.0f, 0.0f);
        System.out.println(vehicle4.displayVehicleStatus());
        
        VehicleTracker vehicle5 = new VehicleTracker("CAR005", 200.0f, 100.0f);
        System.out.println(vehicle5.displayVehicleStatus());
        
        System.out.println("\n=== All tests completed successfully ===");
    }
}