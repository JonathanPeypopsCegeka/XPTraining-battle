package be.cegeka.battle;

public class FightSimulator {

    public FightSimulator() {
    }

    public static Soldier fight(Soldier attacker, Soldier defender) {
        if (attacker.getWeapon().getDamage() < defender.getWeapon().getDamage()) {
            return defender;
        }
        return attacker;
    }

    public Army armyFight(Army attackinArmy, Army defendingArmy) {
        while (attackinArmy.hasSoldiers() && defendingArmy.hasSoldiers()) {
            Soldier winningFrontMan = fight(attackinArmy.getFrontMan(), defendingArmy.getFrontMan());
            if (!attackinArmy.getFrontMan().equals(winningFrontMan)) {
                attackinArmy.removeFrontMan();
            } else {
                defendingArmy.removeFrontMan();
            }
        }
        if (attackinArmy.hasSoldiers()) {
            return attackinArmy;
        }
        return defendingArmy;
    }

}
