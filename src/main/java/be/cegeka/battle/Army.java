package be.cegeka.battle;


import java.util.LinkedList;
public class Army {

    private LinkedList<Soldier> army;
    public Army() {
        army = new LinkedList<>();
    }

    public void enlist(Soldier soldier){
        army.add(soldier);
    }

    public Soldier getFrontMan(){
        return army.getFirst();
    }

    public void removeFrontMan(){
        army.removeFirst();
    }

    public int getArmySize(){
        return army.size();
    }
    public boolean hasSoldiers(){
        return getArmySize() != 0;
    }

    public Army armyFight(Army defendingArmy) {
        simulateWar(this, defendingArmy);
        return getWinningArmy(this, defendingArmy);
    }

    private void simulateWar(Army attackingArmy, Army defendingArmy) {
        while (attackingArmy.hasSoldiers() && defendingArmy.hasSoldiers()) {
            Soldier winningFrontMan = attackingArmy.getFrontMan().fight(defendingArmy.getFrontMan());
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
