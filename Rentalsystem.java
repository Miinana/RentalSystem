package VehicleRental;

import java.util.ArrayList;

public class Rentalsystem {
    private ArrayList<Vehicle> vehicles;

    // Constructor
    public Rentalsystem() {
        this.vehicles = new ArrayList<>();
    }

    // Method to add a vehicle to the system
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Method to search vehicles by brand
    public ArrayList<Vehicle> searchVehiclesByBrand(String brand) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(brand)) {
                result.add(vehicle);
            }
        }
        return result;
    }
	}
