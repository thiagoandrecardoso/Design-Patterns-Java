package strategy.war.models;

import strategy.war.interfaces.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void UseWeapon() {
        System.out.println("Cutting with an axe");
    }
}
