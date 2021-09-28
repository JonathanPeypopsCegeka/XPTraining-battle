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
        simulateWar( defendingArmy);
        return getWinningArmy(defendingArmy);
    }

    private void simulateWar(Army defendingArmy) {
        while (this.hasSoldiers() && defendingArmy.hasSoldiers()) {
            Soldier winningFrontMan = this.getFrontMan().fight(defendingArmy.getFrontMan());
            removeLostFrontMan( defendingArmy, winningFrontMan);
        }
    }

    private Army getWinningArmy( Army defendingArmy) {
        if (this.hasSoldiers()) {
            return this;
        }
        return defendingArmy;
    }

    private void removeLostFrontMan( Army defendingArmy, Soldier winningFrontMan) {
        if (!this.getFrontMan().equals(winningFrontMan)) {
            this.removeFrontMan();
        } else {
            defendingArmy.removeFrontMan();
        }
    }
}
