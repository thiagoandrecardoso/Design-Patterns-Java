package behavioral.strategy.ducks.run;

import behavioral.strategy.ducks.abst.Duck;
import behavioral.strategy.ducks.models.FlyRocketPowered;
import behavioral.strategy.ducks.models.MallardDuck;
import behavioral.strategy.ducks.models.ModelDuck;

public class MiniDuckSImulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
