package behavioral.strategy.war.models;

import behavioral.strategy.war.interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("Handle a sword");
    }
}
