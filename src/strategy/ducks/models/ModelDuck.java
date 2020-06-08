package strategy.ducks.models;

import strategy.ducks.abst.Duck;

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
