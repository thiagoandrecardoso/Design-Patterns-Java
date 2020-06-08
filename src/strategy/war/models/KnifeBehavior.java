package strategy.war.models;

import strategy.war.interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("Cut with a knife");
    }
}
