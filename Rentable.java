package VehicleRental;
//interface
public interface Rentable {
    boolean isAvailable(int rentalDays);
    double calculateRentalCost(int rentalDays);
}