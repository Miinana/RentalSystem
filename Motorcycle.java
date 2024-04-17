package VehicleRental;

public class Motorcycle extends Vehicle implements Rentable {
    // Constructor
    public Motorcycle(String make, String model, int year, double rentalPricePerDay) {
        super(make, model, year, rentalPricePerDay);
    }

    // Implementation of Rentable interface methods
    @Override
    public boolean isAvailable(int rentalDays) {
        // Simplified logic to check availability
        return true;
    }
    @Override
    public double calculateRentalCost(int rentalDays) {
        // Simplified logic to calculate rental cost
        return rentalDays * getRentalPricePerDay();
    }
}