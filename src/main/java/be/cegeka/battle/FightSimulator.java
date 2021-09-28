package be.cegeka.battle;

public class FightSimulator {

    public FightSimulator() {
    }

    public static Soldier fight(Soldier attacker, Soldier defender) {
        if (defender.getWeapon().isStrongerThan(attacker.getWeapon())){
            return defender;
        }
        return attacker;
    }

    public Army armyFight(Army attackingArmy, Army defendingArmy) {
        simulateWar(attackingArmy, defendingArmy);
        return getWinningArmy(attackingArmy, defendingArmy);
    }

    private void simulateWar(Army attackingArmy, Army defendingArmy) {
        while (attackingArmy.hasSoldiers() && defendingArmy.hasSoldiers()) {
            Soldier winningFrontMan = fight(attackingArmy.getFrontMan(), defendingArmy.getFrontMan());
            removeLostFrontMan(attackingArmy, defendingArmy, winningFrontMan);
        }
    }

    private Army getWinningArmy(Army attackingArmy, Army defendingArmy) {
        if (attackingArmy.hasSoldiers()) {
            return attackingArmy;
        }
        return defendingArmy;
    }

    private void removeLostFrontMan(Army attackingArmy, Army defendingArmy, Soldier winningFrontMan) {
        if (!attackingArmy.getFrontMan().equals(winningFrontMan)) {
            attackingArmy.removeFrontMan();
        } else {
            defendingArmy.removeFrontMan();
        }
    }


}
