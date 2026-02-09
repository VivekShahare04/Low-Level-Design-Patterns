package parkinglot.entities;

import parkinglot.vehicle.Vehicle;
import parkinglot.vehicle.VehicleSize;

public class ParkingSpot {
    private final String spotId;
    private final VehicleSize spotSize;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public ParkingSpot(String spotId, VehicleSize spotSize){
        this.spotId = spotId;
        this.spotSize = spotSize;
    }

    public synchronized boolean canFitVehicle(Vehicle vehicle){
        return !isOccupied && vehicle.getSize().ordinal() <= spotSize.ordinal();
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public synchronized void removeVehicle(){
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied(){
        return !isOccupied;
    }
}
