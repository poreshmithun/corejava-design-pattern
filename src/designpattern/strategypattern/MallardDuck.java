package designpattern.strategypattern;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
