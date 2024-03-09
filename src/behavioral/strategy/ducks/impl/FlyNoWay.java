package behavioral.strategy.ducks.impl;

import behavioral.strategy.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I Can't fly!!");
    }
}
