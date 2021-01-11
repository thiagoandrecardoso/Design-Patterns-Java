package behavioral.strategy.ducks.models;

import behavioral.strategy.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I Can't fly!!");
    }
}
