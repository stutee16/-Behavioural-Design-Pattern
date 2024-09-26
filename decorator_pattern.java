interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza tempPizza;

    public PizzaDecorator(Pizza pizza) {
        tempPizza = pizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.50;
    }
}

class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 2.00;
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
    }
}
