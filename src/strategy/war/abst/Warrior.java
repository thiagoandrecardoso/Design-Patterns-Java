package strategy.war.abst;

import strategy.war.interfaces.WeaponBehavior;

public abstract class Warrior {
    public WeaponBehavior weaponBehavior;

    public Warrior() {
    }

    public abstract void fight();

    public void performWeapon() {
        weaponBehavior.UseWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
