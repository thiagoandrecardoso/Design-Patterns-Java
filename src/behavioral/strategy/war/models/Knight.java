package behavioral.strategy.war.models;

import behavioral.strategy.war.abst.Warrior;

public class Knight extends Warrior {

    public Knight() {
        this.weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
