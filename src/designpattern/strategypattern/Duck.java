package designpattern.strategypattern;

public abstract class Duck {
    //display()
    //quack()
    //swim()
    //fly()
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public abstract  void display();

    public void swim() {
        System.out.println("All ducks float, even rubber");
    }

    public void performFly() {
        flyBehaviour.fly();
    }
    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
