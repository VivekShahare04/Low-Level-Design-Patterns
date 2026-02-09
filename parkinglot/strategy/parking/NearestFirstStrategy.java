package parkinglot.strategy.parking;
import java.util.*;
import java.util.Optional;
import java.util.List;
import parkinglot.entities.ParkingFloor;
import parkinglot.entities.ParkingSpot;
import parkinglot.vehicle.Vehicle;

public class NearestFirstStrategy implements ParkingStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(List<ParkingFloor> floors, Vehicle vehicle) {

        for (ParkingFloor floor : floors) {
            Optional<ParkingSpot> spot = floor.findAvailableSpot(vehicle);

            if (spot.isPresent()) {
                return spot; // first available spot found
            }
        }
        return Optional.empty(); // parking full
    }
}
