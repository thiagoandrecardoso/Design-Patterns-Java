package behavioral.strategy.war.models;

import behavioral.strategy.war.abst.Warrior;

public class King extends Warrior {

    public King() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
