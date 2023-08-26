package designpattern.strategypattern;

/**
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently of clients that use it.
 *
 * Always have the HAS-A relationship (Composition) with Encapsulated entity.
 * Initialize encapsulated behaviours in concrete class's constructor
 */
public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.setFlyBehaviour(new FlyRocketPowered());
        rubber.performFly();
        rubber.performQuack();
    }
}
