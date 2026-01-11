package Structural.Composite;

public class CompositeTest {
    public static void main(String[] args) {
        
        Component monitor = new Leaf("Monitor", 150.0);
        Component keyboard = new Leaf("Keyboard", 50.0);
        Component mouse = new Leaf("Mouse", 25.0);
        Component cpu = new Leaf("CPU", 300.0);
        Component ram = new Leaf("RAM", 100.0);
        Composite computer = new Composite("Computer");
        Composite peri = new Composite("Peripherals");

        peri.addComponent(mouse);
        peri.addComponent(keyboard);
        peri.addComponent(monitor);

        computer.addComponent(cpu);
        computer.addComponent(ram);
        computer.addComponent(peri);

        computer.showprice();
        //peri.showprice();
    }
}
