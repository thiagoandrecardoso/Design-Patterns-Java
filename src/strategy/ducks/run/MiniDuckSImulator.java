package strategy.ducks.run;

import strategy.ducks.abst.Duck;
import strategy.ducks.models.FlyRocketPowered;
import strategy.ducks.models.MallardDuck;
import strategy.ducks.models.ModelDuck;

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
