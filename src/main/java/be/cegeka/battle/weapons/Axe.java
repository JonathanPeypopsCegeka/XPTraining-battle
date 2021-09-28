package be.cegeka.battle.weapons;

public class Axe implements Weapon {
    @Override
    public int getDamage() {
        return 3;
    }

    @Override
    public String getWeaponType() {
        return "Axe";
    }
}
