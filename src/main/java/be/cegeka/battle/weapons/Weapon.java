package be.cegeka.battle.weapons;

public abstract class Weapon {
    int getDamage() {
        return 0;
    }
    public boolean isStrongerThan(Weapon weapon) {
        return getDamage() > weapon.getDamage();
    }
}
