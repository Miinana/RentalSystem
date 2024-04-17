package VehicleRental;

public class Car extends Vehicle implements Rentable {
    // Constructor
    public Car(String make, String model, int year, double rentalPricePerDay) {
        super(make, model, year, rentalPricePerDay);
    }
    @Override
 // check availability
    public boolean isAvailable(int rentalDays) {
        
        return true;
    }

 //calculate rental cost
    @Override
    public double calculateRentalCost(int rentalDays) {
        
        return rentalDays *getRentalPricePerDay();
    }

    // Additional method specific to Car class
    public double getRentalPricePerDay() {
        return super.getRentalPricePerDay(); // Accessing the rentalPricePerDay from the base class
    }
}
