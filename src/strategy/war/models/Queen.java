package strategy.war.models;

import strategy.war.abst.Warrior;

public class Queen extends Warrior {

    public Queen() {
        this.weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }

}
