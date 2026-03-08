package Milestone;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    //Gets the details of the automobile
    public String[] getAutoInfo() {
        return new String[] {
            this.make,
            this.model,
            this.color,
            String.valueOf(this.year),
            String.valueOf(this.mileage)
        };
    }

    //Update Vehicle details
    public void updateMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return this.make;
    }

    public void updateModel(String model) {
        this.model = model;
    }
    public void updateColor(String color) {
        this.color = color;
    }
    public void updateYear(int year) {
        this.year = year;
    }
    public void updateMileage(int mileage) {
        this.mileage = mileage;
    }

}
