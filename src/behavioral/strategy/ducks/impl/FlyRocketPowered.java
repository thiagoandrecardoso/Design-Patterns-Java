package behavioral.strategy.ducks.impl;

import behavioral.strategy.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket!");
    }
}
