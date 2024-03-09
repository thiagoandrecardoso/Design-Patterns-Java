package behavioral.strategy.ducks.models;

import behavioral.strategy.ducks.abst.Duck;
import behavioral.strategy.ducks.impl.FlyWithWings;
import behavioral.strategy.ducks.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallord Duck real!!!");
    }
}
