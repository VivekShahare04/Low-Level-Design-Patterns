package Creational.Builder;
public class Phone {

    private String brand;
    private String ram;
    private String storage;
    private String processor;

    public Phone(String brand, String ram, String storage, String processor){
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

}
