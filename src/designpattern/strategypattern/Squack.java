package designpattern.strategypattern;

public class Squack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
