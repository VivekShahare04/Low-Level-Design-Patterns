public interface Pizza {
    String getDescription();
    double getCost();
}

class Margherita implements Pizza{
    
    @Override
    public String getDescription(){
        return "Margherita Pizza";
    }
    @Override
    public double getCost(){
        return 100.0;
    }
}

class Farmhouse implements Pizza{
    @Override
    public String getDescription(){
        return "Farmhouse Pizza";
    }
    @Override
    public double getCost(){
        return 150.0;
    }
}

abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}

class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription(){
        return pizza.getDescription() + " with Cheese";
    }
    @Override
    public double getCost(){
        return pizza.getCost() + 20.0;
    }
}

class Olives extends PizzaDecorator{
    public Olives(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription(){
        return pizza.getDescription() + " with Olives";
    }   
    @Override
    public double getCost(){
        return pizza.getCost() + 15.0;
    }
}