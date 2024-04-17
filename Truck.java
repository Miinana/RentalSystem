package VehicleRental;

public class Truck extends Vehicle implements Rentable {
    // Constructor
    public Truck(String make, String model, int year, double rentalPricePerDay) {
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

    // Additional method specific to Truck class
    public double getRentalPricePerDay() {
        return super.getRentalPricePerDay();
    }
}
