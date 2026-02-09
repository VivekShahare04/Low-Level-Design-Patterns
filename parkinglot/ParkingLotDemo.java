package parkinglot;

import parkinglot.entities.*;
import parkinglot.strategy.parking.*;
import parkinglot.strategy.fee.*;
import parkinglot.vehicle.*;

import java.util.*;

public class ParkingLotDemo {

    public static void main(String[] args) {

        System.out.println("🚀 Parking Lot System Started");

        // 1️⃣ Get Parking Lot instance
        ParkingLotSystem parkingLot = ParkingLotSystem.getInstance();
        System.out.println("ParkingLotSystem instance created");

        // 2️⃣ Set Parking Strategy
        parkingLot.setParkingStrategy(new NearestFirstStrategy());
        System.out.println("Parking Strategy set to NearestFirstStrategy");

        // 3️⃣ Set Fee Strategy
        parkingLot.setFeeStrategy(new FlatRateFeeStrategy());
        System.out.println("Fee Strategy set to FlatRateFeeStrategy");

        // 4️⃣ Create Floor
        ParkingFloor floor1 = new ParkingFloor(1);
        System.out.println("Created Parking Floor 1");

        // // 5️⃣ Add Parking Spots
        // floor1.addParkingSpot(new ParkingSpot("S1", VehicleSize.SMALL));
        // floor1.addParkingSpot(new ParkingSpot("S2", VehicleSize.MEDIUM));
        // floor1.addParkingSpot(new ParkingSpot("S3", VehicleSize.LARGE));
        // System.out.println("🅿️ Added parking spots to Floor 1");

        // 6️⃣ Add floor to parking lot
        parkingLot.addFloor(floor1);
        System.out.println("Floor 1 added to ParkingLotSystem");

        // 7️⃣ Create Vehicle
        Vehicle car = new Car("KA01AB1234");
        System.out.println("Vehicle created: " + car.getLicenseNumber());

        // 8️⃣ Park Vehicle
        Optional<ParkingTicket> ticketOpt = parkingLot.parkVehicle(car);

        if (ticketOpt.isPresent()) {
            System.out.println("Ticket generated: " + ticketOpt.get().getTicketId());
        } else {
            System.out.println("Parking failed");
        }

        // 9️⃣ Unpark Vehicle
        System.out.println("⏹ Vehicle leaving parking lot");

        Optional<Double> feeOpt = parkingLot.unparkVehicle(car.getLicenseNumber());

        if (feeOpt.isPresent()) {
            System.out.println("💰 Parking Fee: ₹" + feeOpt.get());
        } else {
            System.out.println("Parking Fee: 0");
        }

        System.out.println("🏁 Parking Lot System Ended");
    }
}
