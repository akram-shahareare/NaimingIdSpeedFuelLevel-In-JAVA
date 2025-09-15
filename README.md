# Vehicle Tracking System in Java

A Java program for a vehicle tracking system that manages vehicle ID, speed, and fuel level with proper validation and display functionality.

## Features

- **Vehicle Data Management**: Store and update vehicle ID (String), speed (float), and fuel level (float)
- **Input Validation**: 
  - Speed must be non-negative (automatically set to 0 if negative)
  - Fuel level must be between 0 and 100 (automatically clamped to valid range)
- **Meaningful Variable Names**: Following Java naming conventions
- **Error Handling**: Proper input validation and error messages

## How to Use

### Compilation
```bash
javac VehicleTracker.java
```

### Running the Program
```bash
java VehicleTracker
```

### Input Format
Provide input as a single line with three values separated by spaces:
```
<vehicle_id> <speed> <fuel_level>
```

Example:
```
VH001 65.5 75.0
```

### Output Format
The program outputs the vehicle information in a single line:
```
Vehicle ID: VH001, Speed: 65.50, Fuel Level: 75.00
```

## Example Usage

```bash
echo "VH001 65.5 75.0" | java VehicleTracker
```

Output:
```
Vehicle ID: VH001, Speed: 65.50, Fuel Level: 75.00
```

## Testing

Run the test class to see all functionality:
```bash
javac TestVehicleTracker.java
java TestVehicleTracker
```

## Validation Examples

- **Negative Speed**: `VH002 -10.5 50.0` → Speed set to 0.00
- **High Fuel Level**: `VH003 45.0 150.0` → Fuel level capped at 100.00
- **Low Fuel Level**: `VH004 30.0 -5.0` → Fuel level set to 0.00

## Class Structure

### VehicleTracker Class
- **Instance Variables**: `vehicleId`, `vehicleSpeed`, `fuelLevel`
- **Constructor**: Initialize with validation
- **updateVehicleData()**: Update speed and fuel level with validation
- **displayVehicleStatus()**: Return formatted vehicle information
- **Getter/Setter methods**: Access and modify vehicle data
- **main()**: Handle input parsing and program execution
