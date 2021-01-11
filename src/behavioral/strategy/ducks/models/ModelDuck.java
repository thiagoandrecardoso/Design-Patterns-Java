package behavioral.strategy.ducks.models;

import behavioral.strategy.ducks.abst.Duck;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("im a model duck!");
    }
}
