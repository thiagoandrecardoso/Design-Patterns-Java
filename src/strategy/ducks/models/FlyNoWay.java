package strategy.ducks.models;

import strategy.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I Can't fly!!");
    }
}
