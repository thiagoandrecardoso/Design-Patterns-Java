package ducks.models;

import strategy.war.abst.Warrior;
import strategy.war.models.BowAndArrowBehavior;

public class Knight extends Warrior {

    public Knight() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
