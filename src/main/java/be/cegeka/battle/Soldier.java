package be.cegeka.battle;

import be.cegeka.battle.weapons.BareFist;
import be.cegeka.battle.weapons.Weapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon;

    public Soldier(String name) {
        this(name, new BareFist());
    }

    public Soldier(String name, Weapon weapon) {
        Validate.isTrue(isNotBlank(name));
        this.name = name;
        this.weapon = weapon;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeaponStrategy(Weapon weapon) {
        this.weapon = weapon;
    }
}
