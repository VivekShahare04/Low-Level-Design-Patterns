package parkinglot.strategy.fee;

import parkinglot.entities.ParkingTicket;

public class FlatRateFeeStrategy implements FeeStrategy {
    private static final double RATE_PER_HOUR = 10; 

    public double calculateFee(ParkingTicket ticket) {
        return RATE_PER_HOUR * ticket.getDurationInHours();
    }
}
