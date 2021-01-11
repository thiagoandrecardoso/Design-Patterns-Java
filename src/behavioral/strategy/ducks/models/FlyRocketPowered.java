package behavioral.strategy.ducks.models;

import behavioral.strategy.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket!");
    }
}
