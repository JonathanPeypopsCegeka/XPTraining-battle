package be.cegeka.battle;

import be.cegeka.battle.weapons.Axe;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {
    @Test
    public void Army_givenAnArmy_thenFrontManIsShown(){
        Soldier soldierOne = new Soldier("Hulk");
        Soldier soldierTwo = new Soldier("Heri", new Axe());

        Army army = new Army();

        army.enlist(soldierTwo);
        army.enlist(soldierOne);

        assertThat(army.getFrontMan()).isEqualTo(soldierTwo);
    }
}
