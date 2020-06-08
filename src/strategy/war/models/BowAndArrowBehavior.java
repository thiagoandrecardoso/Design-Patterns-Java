package strategy.war.models;

import strategy.war.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("Shoot an arrow with a bow");
    }
}
