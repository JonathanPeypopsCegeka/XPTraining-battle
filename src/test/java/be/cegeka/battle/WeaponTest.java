package be.cegeka.battle;

import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WeaponTest {
    @Test
    public void WeaponStrategy_givenDefault_thenBareFist(){
        Soldier soldier = new Soldier("Wobbe");
        assertThat(soldier.getWeaponType()).isEqualTo("Bare fists");
    }

    @Test
    public void WeaponStrategy_givenSpearWeaponAfterDefault_thenSpearIsUsed(){
        Soldier soldier = new Soldier("Wobbe");
        soldier.setWeaponStrategy(new Spear());
        assertThat(soldier.getWeaponType()).isEqualTo("Spear");
    }

    @Test
    public void WeaponStrategy_givenNameAndWeapon_thenDefaultWeaponNotUsed(){
        Soldier soldier = new Soldier("Henk", new Sword());
        assertThat(soldier.getWeaponType()).isEqualTo("Sword");
    }

}
