package parkinglot.entities;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import parkinglot.vehicle.Vehicle;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<String, ParkingSpot> spots = new HashMap<>();

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addSpot(ParkingSpot spot) {
        spots.put(spot.toString(), spot);
    }

    public Optional<ParkingSpot> findAvailableSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.canFitVehicle(vehicle)) {
                return Optional.of(spot);
            }
        }
        return Optional.empty();
    }
}