package parkinglot.strategy.parking;

import java.util.List;

import parkinglot.vehicle.Vehicle;
import parkinglot.entities.ParkingSpot;
import parkinglot.entities.ParkingFloor;
import java.util.Optional;

public interface ParkingStrategy {
    Optional<ParkingSpot> findSpot(List<ParkingFloor> floors, Vehicle vehicle);
}
