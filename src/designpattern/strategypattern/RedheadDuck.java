package designpattern.strategypattern;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squack();
    }
    @Override
    public void display() {
        System.out.println("I'm a redhead duck");
    }
}
