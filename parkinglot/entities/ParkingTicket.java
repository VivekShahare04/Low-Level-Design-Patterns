package parkinglot.entities;

import parkinglot.vehicle.Vehicle;

public class ParkingTicket {
    private final String ticketId;
    private final ParkingSpot spot;
    private final Vehicle vehicle;
    private final long entryTime;
    private long exitTime;

    public ParkingTicket(String ticketId, ParkingSpot spot, Vehicle vehicle, long entryTime) {
        this.ticketId = ticketId;
        this.spot = spot;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }

    public void closeTicket(){
        this.exitTime = System.currentTimeMillis();
    }

    public long getDurationInHours(){
        return Math.max(1,(exitTime - entryTime) / (1000 * 60 * 60));
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getTicketId() {
        return ticketId;
    }
}
