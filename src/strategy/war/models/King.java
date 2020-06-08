package strategy.war.models;

import strategy.war.abst.Warrior;

public class King extends Warrior {

    public King() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
