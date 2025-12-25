package Creational.Builder;
public class PhoneBuilder {
    private String brand;
    private String ram;
    private String storage;
    private String processor;

    public PhoneBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setRam(String ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setStorage(String storage){
        this.storage = storage;
        return this;
    }
    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public Phone getPhone(){
        return new Phone(brand, ram, storage, processor);
    }
}
