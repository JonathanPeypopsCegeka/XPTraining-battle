package be.cegeka.battle.weapons;

public class Sword implements Weapon {
    @Override
    public int getDamage() {
        return 2;
    }

    @Override
    public String getWeaponType() {
        return "Sword";
    }
}