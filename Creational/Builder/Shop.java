package Creational.Builder;
public class Shop {
    public static void main(String[] args) {
        PhoneBuilder pb = new PhoneBuilder();
        Phone p = pb.setBrand("Iphone").setRam("8GB").getPhone();
        System.out.println(p);
    }
}
