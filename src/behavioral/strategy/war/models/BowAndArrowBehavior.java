package behavioral.strategy.war.models;

import behavioral.strategy.war.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("Shoot an arrow with a bow");
    }
}
