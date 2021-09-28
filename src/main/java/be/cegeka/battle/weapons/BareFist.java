package be.cegeka.battle.weapons;

public class BareFist implements Weapon {

    @Override
    public int getDamage() {
        return 1;
    }

    @Override
    public String getWeaponType() {
        return "Bare fists";
    }
}
