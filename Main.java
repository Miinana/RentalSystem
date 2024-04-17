package VehicleRental;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a rental system
        Rentalsystem rentalsystem = new Rentalsystem();

        // Add vehicles to the system
        rentalsystem.addVehicle(new Car("Toyota", "Camry", 2022, 60.0));
        rentalsystem.addVehicle(new Car("Honda", "Civic", 2021, 49.50));
        rentalsystem.addVehicle(new Car("Ford", "F-150", 2018, 88.00));
        rentalsystem.addVehicle(new Motorcycle("Harley Davidson", "VR6", 2010, 84.0));
        rentalsystem.addVehicle(new Truck("Volvo", "VNL64T300", 2015, 29.0));

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();

        // Search for vehicles by brand
        ArrayList<Vehicle> searchResult = rentalsystem.searchVehiclesByBrand(brand);

        // If the search result is empty
        if (searchResult.isEmpty()) {
            System.out.println("Sorry, requested brand is not available for rental.");
        } else {
        	
            // Iterate over each vehicle                      
            for (Vehicle vehicle : searchResult) {
                
                if (((Rentable) vehicle).isAvailable(rentalDays)) {
                    
                	// Calculate the rental fee
                    double rentalFee = ((Rentable) vehicle).calculateRentalCost(rentalDays);

                    // Print vehicle details, availability status, and rental fee
                    System.out.println("\nSearch results for " + brand + ":");
                    System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
                    System.out.println("Availability: Available");
                    System.out.println("Rental Fee: $" + rentalFee);
                } else {
                    System.out.println("Search results for " + brand + ":");
                    System.out.println("Vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
                    System.out.println("Availability: Not Available for the specified rental period");
                }
            }
        }
        scanner.close();
    }
}
