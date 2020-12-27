package ducks.run;

import ducks.abst.Duck;
import ducks.models.FlyRocketPowered;
import ducks.models.MallardDuck;
import ducks.models.ModelDuck;

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
