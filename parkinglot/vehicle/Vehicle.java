package parkinglot.vehicle;

public abstract class Vehicle {
    protected VehicleSize size;
    protected String LicenseNumber;

    public Vehicle(VehicleSize size, String LicenseNumber){
        this.size = size;
        this.LicenseNumber = LicenseNumber;
    }

    public VehicleSize getSize(){
        return size;
    }

    public String getLicenseNumber(){
        return LicenseNumber;
    }
}
