package structuralDesignPattern.decoratorDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

//    Problematic Pizza Application without Decorator Pattern
//    Scalability Issues: Every new topping requires a new subclass.
//    Code Duplication: Common code i₹s repeated across subclasses.
//    Maintenance Challenges: Changes in base pizza affect all subclasses.
public class PizzaApp {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription() + " Cost: $" + basicPizza.getCost());

        Pizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.getDescription() + " Cost: $" + cheesePizza.getCost());

        Pizza pepperoniPizza = new CheeseOlivePizza();
        System.out.println(pepperoniPizza.getDescription() + " Cost: $" + pepperoniPizza.getCost());
    }
}
