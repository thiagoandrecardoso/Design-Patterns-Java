package behavioral.strategy.ducks.models;

import behavioral.strategy.war.abst.Warrior;
import behavioral.strategy.war.models.BowAndArrowBehavior;

public class Knight extends Warrior {

    public Knight() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
