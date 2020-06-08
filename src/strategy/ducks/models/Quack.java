package strategy.ducks.models;

import strategy.ducks.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
