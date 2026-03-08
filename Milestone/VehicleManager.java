package Milestone;

import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Automobile> vehicles;

    // Default constructor
    public VehicleManager() {
        this.vehicles = new ArrayList<>();
    }

    // Add a vehicle to the manager
    public void addVehicle(Automobile vehicle) {
        try{
            if (vehicle == null) {
                throw new IllegalArgumentException("Vehicle cannot be null");
            }
            this.vehicles.add(vehicle);
            System.out.println(vehicle.getMake() + " added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    //remove a vehicle from the manager by Automobile object
    public void removeVehicle(int vehicleIndex) {
        try {
            if (this.vehicles == null) {
                throw new IllegalArgumentException("Vehicle list cannot be null");
            }
            if (vehicleIndex < 0 || vehicleIndex >= this.vehicles.size()) {
                throw new IllegalArgumentException("Invalid vehicle index");
            }
            this.vehicles.remove(vehicleIndex);
            System.out.println("Vehicle removed successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
   
    //Update the attributes of a vehicle in the manager by index
    public void updateVehicleAttributes(int vehicleIndex, String make, String model, String color, int year, int mileage) {
        try {
            if (this.vehicles == null) {
                throw new IllegalArgumentException("Vehicle list cannot be null");
            }
            if (vehicleIndex < 0 || vehicleIndex >= this.vehicles.size()) {
                throw new IllegalArgumentException("Invalid vehicle index");
            }
            this.vehicles.get(vehicleIndex).updateMake(make);
            this.vehicles.get(vehicleIndex).updateModel(model);
            this.vehicles.get(vehicleIndex).updateColor(color);
            this.vehicles.get(vehicleIndex).updateYear(year);
            this.vehicles.get(vehicleIndex).updateMileage(mileage);
            System.out.println("Vehicle attributes updated successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    // Display all vehicles in the manager
    public void displayVehicles() {
        if (this.vehicles == null || this.vehicles.isEmpty()) {
            System.out.println("No vehicles to display");
            return;
        }
        System.out.println("\nVehicles in the manager:");
        int index = 0; 
        for (Automobile vehicle : this.vehicles) {
            //getAutoInfo returns an array of strings with the vehicle's attributes, which we can then print out in a readable format
            String[] info = vehicle.getAutoInfo();
            System.out.println(index + ". Make: " + info[0] + ", Model: " + info[1] + "\n\tColor: " + info[2] + ", Year: " + info[3] + ", Mileage: " + info[4]);
            index++;
        }
    }

    public ArrayList<Automobile> getVehicles() {
        return this.vehicles;
    }
}
