package parkinglot.strategy.fee;

import java.util.Map;
import parkinglot.entities.ParkingTicket;
import parkinglot.vehicle.VehicleSize;

public class VehicleBasedFeeStartegy implements FeeStrategy {
    private final Map<VehicleSize,Double> hourlyRates;

    public VehicleBasedFeeStartegy(Map<VehicleSize, Double> hourlyRates) {
        this.hourlyRates = hourlyRates;
    }

    public double calculateFee(ParkingTicket ticket) {
        VehicleSize size = ticket.getVehicle().getSize();
        return ticket.getDurationInHours() * hourlyRates.get(size);
    }
}
