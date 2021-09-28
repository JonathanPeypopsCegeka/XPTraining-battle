package be.cegeka.battle;

import be.cegeka.battle.weapons.BareFist;
import be.cegeka.battle.weapons.Weapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));
        weapon = new BareFist();
        this.name = name;
    }

    public Soldier(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    String getName() {
        return this.name;
    }

    public String getWeaponType() {
        return weapon.getWeaponType();
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeaponStrategy(Weapon weapon) {
        this.weapon = weapon;
    }
}
