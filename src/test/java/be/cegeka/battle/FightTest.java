package be.cegeka.battle;

import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FightTest {
    @Test
    public void FightSimulator_givenAttackerWithAxeAndDefenderWithSword_thenAttackerWins(){
        Soldier attacker = new Soldier("Guan", new Axe());
        Soldier defender = new Soldier("Deag", new Sword());

        assertThat(attacker.fight(defender)).isEqualTo(attacker);
    }

    @Test
    public void FightSimulator_givenAttackerWithBareFistsAndDefenderWithAxe_thenDefenderWins(){
        Soldier attacker = new Soldier("Bob");
        Soldier defender = new Soldier("Def", new Axe());

        assertThat(attacker.fight(defender)).isEqualTo(defender);
    }

    @Test
    public void FightSimulator_givenAttackerAndDefenderAreTheSame_thenAttackerWins(){
        Soldier attacker = new Soldier("EEN", new Sword());
        Soldier defender = new Soldier("Got stabbed", new Spear());

        assertThat(attacker.fight(defender)).isEqualTo(attacker);
    }
    @Test
    public void FightSimulator_givenOneArmyWithOnlyAxesVSArmyWithOnlyBareFisters_thenTheAxeArmyWins(){
        Army axeAttackingArmy = new Army();
        Army bareFistArmy = new Army();

        axeAttackingArmy.enlist(new Soldier("Bob", new Axe()));
        axeAttackingArmy.enlist(new Soldier("Bob", new Axe()));
        axeAttackingArmy.enlist(new Soldier("Bob", new Axe()));
        bareFistArmy.enlist(new Soldier("Bob"));
        bareFistArmy.enlist(new Soldier("Paul"));
        bareFistArmy.enlist(new Soldier("Bart"));


        assertThat(axeAttackingArmy.armyFight(bareFistArmy)).isEqualTo(axeAttackingArmy);


    }
}
