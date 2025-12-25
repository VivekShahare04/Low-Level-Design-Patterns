package Creational.Factory.OS;
import Creational.Factory.Phone.OS;
import Creational.Factory.Phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}
