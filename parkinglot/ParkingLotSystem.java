package parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import parkinglot.entities.ParkingTicket;
import parkinglot.strategy.fee.FeeStrategy;
import parkinglot.strategy.parking.ParkingStrategy;
import parkinglot.vehicle.Vehicle;
import parkinglot.entities.ParkingFloor;
import parkinglot.entities.ParkingSpot;

public class ParkingLotSystem {
    private static ParkingLotSystem instance;

    private ParkingStrategy parkingStrategy;
    private FeeStrategy feeStrategy;
    private final List<ParkingFloor> floors = new ArrayList<>();
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    private ParkingLotSystem() {
    }

    public static synchronized ParkingLotSystem getInstance() {
        if (instance == null) {
            instance = new ParkingLotSystem();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public Optional<ParkingTicket> parkVehicle(Vehicle vehicle) {
        Optional<ParkingSpot> spot = parkingStrategy.findSpot(floors, vehicle);

        if (spot.isEmpty())
            return Optional.empty();

        spot.get().parkVehicle(vehicle);
        ParkingTicket ticket = new ParkingTicket(UUID.randomUUID().toString(), spot.get(), vehicle,
                System.currentTimeMillis());
        activeTickets.put(vehicle.getLicenseNumber(), ticket);
        return Optional.of(ticket);
    }

    public Optional<Double> unparkVehicle(String license) {
        ParkingTicket ticket = activeTickets.remove(license);
        if (ticket == null)
            return Optional.empty();

        ticket.closeTicket();
        ticket.getVehicle();
        return Optional.of(feeStrategy.calculateFee(ticket));
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }
}
