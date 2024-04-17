package VehicleRental;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    // Constructor
    public Vehicle(String make, String model, int year, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.setYear(year);
        this.setRentalPricePerDay(rentalPricePerDay);
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable(int rentalDays) {
		return false;
	}
}
