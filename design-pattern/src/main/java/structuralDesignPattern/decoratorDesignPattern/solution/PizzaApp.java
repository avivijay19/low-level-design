package structuralDesignPattern.decoratorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class PizzaApp {
    public static void main(String[] args) {
//        Basic Pizza
        Pizza pizza = new BasicPizza();
//        Adding Cheese, Olive and Mushroom Toppings
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
    }
}
