package behavioral.strategy.war.models;

import behavioral.strategy.war.abst.Warrior;

public class Troll extends Warrior {

    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        this.weaponBehavior.UseWeapon();
    }
}
