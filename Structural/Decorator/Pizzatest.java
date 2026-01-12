public class Pizzatest {
    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        //margherita.getDescription();
        //margherita.getCost();
        //System.out.println(margherita.getDescription() + " Cost: " + margherita.getCost());
        PizzaDecorator cheeseMargherita = new Cheese(margherita);
        System.out.println(cheeseMargherita.getDescription() + " Cost: " + cheeseMargherita.getCost());

        Pizza farmhouse = new Farmhouse();
        PizzaDecorator olivesFarmhouse = new Olives(farmhouse);
        System.out.println(olivesFarmhouse.getDescription() + " Cost: " + olivesFarmhouse.getCost());


        Pizza p = new Cheese(new Olives(new Margherita()));
        System.out.println(p.getDescription() + " Cost: " + p.getCost());
    }
}
