package Structural.Composite;
import java.util.*;

public interface Component {
    void showprice();
}

class Leaf implements Component{
    private String name;
    private double price;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void showprice() {
        System.out.println(name + ": $" + price);
    }
}

class Composite implements Component{
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void showprice() {
        System.out.println("Composite: " + name);
        for (Component component : components) {
            component.showprice();
        }
    }
}
